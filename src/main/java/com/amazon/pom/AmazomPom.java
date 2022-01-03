package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazomPom {
	public WebDriver driver;
	
	@FindBy(id = "nav-hamburger-menu")
	private WebElement search;
	
	@FindBy(xpath = "(//a[@class='hmenu-item'])[13]")
	private WebElement womenclothing;
   
	@FindBy(xpath = "//a[text()='Western Wear']")
	private WebElement westernwear;

	@FindBy(css = "body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-container:nth-child(30) div.a-row.apb-browse-two-col-center-pad:nth-child(2) div.a-column.a-span12.apb-browse-left-nav.apb-browse-col-pad-right.a-span-last:nth-child(2) div.a-row div.a-section.a-spacing-none.apb-browse-refinements div.a-section.a-spacing-none:nth-child(2) ul.a-unordered-list.a-nostyle.a-vertical.a-spacing-medium li.a-spacing-micro.apb-browse-refinements-indent-2:nth-child(12) span.a-list-item a.a-color-base.a-link-normal > span:nth-child(1)")
	private WebElement rainwear;
	

		public AmazomPom(WebDriver driver2) {
       this.driver =driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getSearch() {
		return search;
	}

	public WebElement getWomenclothing() {
		return womenclothing;
	}

	public WebElement getWesternwear() {
		return westernwear;
	}
	
	public WebElement getRainwear() {
		return rainwear;
	}

}
