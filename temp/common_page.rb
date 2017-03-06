
class Page

  KEY_MAP = {"Enter" => :enter,
             "Tab" => :tab,
             "F1"  => :f1,
             "F2"  => :f2,
             "F3"  => :f3,
             "F4"  => :f4,
             "F5"  => :f5,
             "F11"  => :f11,
             "Shift"  => :shift,
             "Alter"  => :alt,
             "Control" => :control
  }

  @browser = nil

  def self.hit_key(key)

    $browsers.last["browser"].send_keys KEY_MAP[key]

  end

  def self.page_text()

    $browsers.last["browser"].text

  end

  def self.click(control)
    element = $browsers.last["browser"].driver.find_element(control[:id_type],control[:id_value])
    element.click
  end

  def self.move_mouse_to(control)
    element = $browsers.last["browser"].driver.find_element(control[:id_type],control[:id_value])
    $browsers.last["browser"].driver.action.move_to(element).perform
  end

  def self.enter(control,text)
      element = $browsers.last["browser"].driver.find_element(control[:id_type],control[:id_value])
      element.send_keys text
  end

  def self.read(control)
      element = $browsers.last["browser"].driver.find_element(control[:id_type],control[:id_value])
      value = element.text
      value
  end

  def self.select_list(control,value)
      s = $browsers.last["browser"].select_list control[:id_type] => control[:id_value]
      s.select value
  end

  def self.check(control)
      c = $browsers.last["browser"].checkbox control[:id_type] => control[:id_value]
      c.set
  end

  def self.select_option(control)
      r = $browsers.last["browser"].radio control[:id_type] => control[:id_value]
      r.set
  end

  def self.is_present(control)
      element = $browsers.last["browser"].driver.find_element(control[:id_type],control[:id_value])
      element.displayed?
  end

  def self.link_present(link_text)
      $browsers.last["browser"].link(text: link_text).present?
  end

  # def wait_for_loading(title)
  #   wait = Selenium::WebDriver::Wait.new(:timeout => 10)
  #   wait.until { @browser.title.start_with? title }
  # end

  def self.read_table(table_control)
      table_element = $browsers.last["browser"].table(table_control[:id_type],table_control[:id_value])
      table_element.hashes
  end

  def self.obtain_table_row_count_on(table_control)
      table_element = $browsers.last["browser"].table(table_control[:id_type],table_control[:id_value])
      table_element.row_count
  end

  def self.obtain_table_row_count_on(table_control)
      table_element = $browsers.last["browser"].table(table_control[:id_type],table_control[:id_value])
      table_element.col_count
  end

  def self.read_table_cell(table_control,row,col)
      table_element = $browsers.last["browser"].table(table_control[:id_type],table_control[:id_value])
      table_element[row][col].text
  end

  def self.logout_of_site
    logout
    wait_until do
      ! (Watir::Anchor.new($browsers.last["browser"], text: 'LOGOUT').exists? && Watir::Anchor.new($browsers.last["browser"], text: 'LOGOUT').visible?)
    end
    clear_cookies
  end

  def self.drop_down_menus_and_select(*menus_list)
    # We may get an array as param when called with drop_down_menus_and_select('menu1', 'menu2') or
    # we may get an array of arrays as the param when called with drop_down_menus_and_select(['menu1', 'menu2']).
    # We want to be able to handle both cases.
    if menus_list.first.is_a? Array
      menus_list = menus_list.first
    end
    select_menu_link = $browsers.last["browser"].link(text: menus_list.pop) # last item in array is to be clicked
    menus_list.each do |menu|
      $browsers.last["browser"].link(text: menu).click
      sleep 0.5
    end
    select_menu_link.click
    wait_for_loading
  end

  # Waits for the "Loading" spinner at the top of the page to go away
  def self.wait_for_loading(timer = 120)
    $logger.debug("Waiting for 'Loading...' to go away")
    $browsers.last["browser"].p(id: 'loadingPage').wait_while_present(timer)
    $logger.debug("Page loaded..")
  end

  # The text in the green box (says stuff like "Add Payer", "Dashboard" etc.)
  def self.get_page_header
    page_header
  end

  # returns true if we are already on the page we need to be in. Page objects must have PAGE_TITLE constant defined to be the page name.
  def self.on_page?
    $logger.debug("ON PAGE #{page_header} but was looking for #{@page_title}")
    page_header == @page_title
  end

  def self.go_to_switchbranch()
    login_url = $browsers.last["browser"].goto $config[:urls]['home']
    $browsers.last["browser"].goto login_url.sub! 'login', 'switch-branch'
  end

  def self.move_next()
    next_link
    wait_for_loading
    Formatter.table_to_hash(results_table_element.when_present)
  end

  def self.go_to_link(link_text)
    $browsers.last["browser"].link(text: link_text).click
  end


  private

  # Clears the cookies in the browser
  def self.clear_cookies
    $browsers.last["browser"].cookies.clear
  end

  #go to a specified link on current page by clicking on it
  def self.got_to_link(link)
    $browsers.last["browser"].link(text: link).click
  end




end