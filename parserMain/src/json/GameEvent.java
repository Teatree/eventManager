package json;

import java.util.Arrays;

/**
 * Created by MainUser on 28/02/2015.
 */
public class GameEvent {

	private String event_name;
	private String event_description;
	private String custom_event_type;
	private String custom_event_title;
	private String custom_event_long_description;
	private String custom_event_icon_id;
	private String custom_event_action_id;
	private String custom_event_action_data;

	// private String custom_event_requared_items;
	private String custom_event_requared_items;

	private String custom_event_tags;

	// private String custom_event_min_goals;
	private String custom_event_min_goals;

	private String custom_event_min_goals_description;
	private String custom_event_priority;
	private String custom_event_versions_list;
	private String custom_event_is_vip;

	// private String countries_filter;
	private String countries_filter;

	// private String tournament_rank_intervals;
	private Long tournament_rank_intervals_value_1_min;
	private Long tournament_rank_intervals_value_1_max;
	private Long tournament_rank_intervals_value_2_min;
	private Long tournament_rank_intervals_value_2_max;
	private Long tournament_rank_intervals_value_3_min;
	private Long tournament_rank_intervals_value_3_max;
	private Long tournament_rank_intervals_value_4_min;
	private Long tournament_rank_intervals_value_4_max;
	private Long tournament_rank_intervals_value_5_min;
	private Long tournament_rank_intervals_value_5_max;

	// private String tournament_gifts;
	private String tournament_gifts_value_1;
	private String tournament_gifts_value_2;
	private String tournament_gifts_value_3;
	private String tournament_gifts_value_4;
	private String tournament_gifts_value_5;
	private String tournament_gifts_name_1;
	private String tournament_gifts_name_2;
	private String tournament_gifts_name_3;
	private String tournament_gifts_name_4;
	private String tournament_gifts_name_5;
	
	private String tournament_gifts_value_1_vip;
	private String tournament_gifts_value_2_vip;
	private String tournament_gifts_value_3_vip;
	private String tournament_gifts_value_4_vip;
	private String tournament_gifts_value_5_vip;
	private String tournament_gifts_name_1_vip;
	private String tournament_gifts_name_2_vip;
	private String tournament_gifts_name_3_vip;
	private String tournament_gifts_name_4_vip;
	private String tournament_gifts_name_5_vip;

	private String localized_fields_value_default;
	private String localized_fields_value_en;
	private String localized_fields_value_fr;
	private String localized_fields_value_de;
	private String localized_fields_value_sp;
	private String localized_fields_value_it;
	private String localized_fields_value_pt;
	private String localized_fields_value_jp;
	private String localized_fields_value_zh;
	private String localized_fields_value_ko;
	private String localized_fields_value_ru;
	private String localized_fields_value_ar;
	private String localized_fields_value_th;
	private String localized_fields_value_zt;
	private String localized_fields_value_id;

	private String tournament_type;
	private String tournament_delivery;
	private String leaderboard_order;
	private String leaderboard_type;
	private Long leaderboard_group_size;

	public GameEvent() {
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_description() {
		return event_description;
	}

	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}

	public String getCustom_event_type() {
		return custom_event_type;
	}

	public void setCustom_event_type(String custom_event_type) {
		this.custom_event_type = custom_event_type;
	}

	public String getTournament_gifts_name_1() {
		return tournament_gifts_name_1;
	}

	public void setTournament_gifts_name_1(String tournament_gifts_name_1) {
		this.tournament_gifts_name_1 = tournament_gifts_name_1;
	}

	public String getTournament_gifts_name_2() {
		return tournament_gifts_name_2;
	}

	public void setTournament_gifts_name_2(String tournament_gifts_name_2) {
		this.tournament_gifts_name_2 = tournament_gifts_name_2;
	}

	public String getTournament_gifts_name_3() {
		return tournament_gifts_name_3;
	}

	public void setTournament_gifts_name_3(String tournament_gifts_name_3) {
		this.tournament_gifts_name_3 = tournament_gifts_name_3;
	}

	public String getTournament_gifts_name_4() {
		return tournament_gifts_name_4;
	}

	public void setTournament_gifts_name_4(String tournament_gifts_name_4) {
		this.tournament_gifts_name_4 = tournament_gifts_name_4;
	}

	public String getTournament_gifts_name_5() {
		return tournament_gifts_name_5;
	}

	public String getTournament_gifts_value_1_vip() {
		return tournament_gifts_value_1_vip;
	}

	public void setTournament_gifts_value_1_vip(String tournament_gifts_value_1_vip) {
		this.tournament_gifts_value_1_vip = tournament_gifts_value_1_vip;
	}

	public String getTournament_gifts_value_2_vip() {
		return tournament_gifts_value_2_vip;
	}

	public void setTournament_gifts_value_2_vip(String tournament_gifts_value_2_vip) {
		this.tournament_gifts_value_2_vip = tournament_gifts_value_2_vip;
	}

	public String getTournament_gifts_value_3_vip() {
		return tournament_gifts_value_3_vip;
	}

	public void setTournament_gifts_value_3_vip(String tournament_gifts_value_3_vip) {
		this.tournament_gifts_value_3_vip = tournament_gifts_value_3_vip;
	}

	public String getTournament_gifts_value_4_vip() {
		return tournament_gifts_value_4_vip;
	}

	public void setTournament_gifts_value_4_vip(String tournament_gifts_value_4_vip) {
		this.tournament_gifts_value_4_vip = tournament_gifts_value_4_vip;
	}

	public String getTournament_gifts_value_5_vip() {
		return tournament_gifts_value_5_vip;
	}

	public void setTournament_gifts_value_5_vip(String tournament_gifts_value_5_vip) {
		this.tournament_gifts_value_5_vip = tournament_gifts_value_5_vip;
	}

	public String getTournament_gifts_name_1_vip() {
		return tournament_gifts_name_1_vip;
	}

	public void setTournament_gifts_name_1_vip(String tournament_gifts_name_1_vip) {
		this.tournament_gifts_name_1_vip = tournament_gifts_name_1_vip;
	}

	public String getTournament_gifts_name_2_vip() {
		return tournament_gifts_name_2_vip;
	}

	public void setTournament_gifts_name_2_vip(String tournament_gifts_name_2_vip) {
		this.tournament_gifts_name_2_vip = tournament_gifts_name_2_vip;
	}

	public String getTournament_gifts_name_3_vip() {
		return tournament_gifts_name_3_vip;
	}

	public void setTournament_gifts_name_3_vip(String tournament_gifts_name_3_vip) {
		this.tournament_gifts_name_3_vip = tournament_gifts_name_3_vip;
	}

	public String getTournament_gifts_name_4_vip() {
		return tournament_gifts_name_4_vip;
	}

	public void setTournament_gifts_name_4_vip(String tournament_gifts_name_4_vip) {
		this.tournament_gifts_name_4_vip = tournament_gifts_name_4_vip;
	}

	public String getTournament_gifts_name_5_vip() {
		return tournament_gifts_name_5_vip;
	}

	public void setTournament_gifts_name_5_vip(String tournament_gifts_name_5_vip) {
		this.tournament_gifts_name_5_vip = tournament_gifts_name_5_vip;
	}

	public void setTournament_gifts_name_5(String tournament_gifts_name_5) {
		this.tournament_gifts_name_5 = tournament_gifts_name_5;
	}

	public String getCustom_event_title() {
		return custom_event_title;
	}

	public void setCustom_event_title(String custom_event_title) {
		this.custom_event_title = custom_event_title;
	}

	public String getCustom_event_long_description() {
		return custom_event_long_description;
	}

	public String getCustom_event_min_goals() {
		return custom_event_min_goals;
	}

	public void setCustom_event_min_goals(String custom_event_min_goals) {
		this.custom_event_min_goals = custom_event_min_goals;
	}

	public String getLocalized_fields_value_default() {
		return localized_fields_value_default;
	}

	public void setLocalized_fields_value_default(
			String localized_fields_value_default) {
		this.localized_fields_value_default = localized_fields_value_default;
	}

	public String getLocalized_fields_value_en() {
		return localized_fields_value_en;
	}

	public void setLocalized_fields_value_en(String localized_fields_value_en) {
		this.localized_fields_value_en = localized_fields_value_en;
	}

	public String getLocalized_fields_value_fr() {
		return localized_fields_value_fr;
	}

	public void setLocalized_fields_value_fr(String localized_fields_value_fr) {
		this.localized_fields_value_fr = localized_fields_value_fr;
	}

	public String getLocalized_fields_value_de() {
		return localized_fields_value_de;
	}

	public void setLocalized_fields_value_de(String localized_fields_value_de) {
		this.localized_fields_value_de = localized_fields_value_de;
	}

	public String getLocalized_fields_value_sp() {
		return localized_fields_value_sp;
	}

	public void setLocalized_fields_value_sp(String localized_fields_value_sp) {
		this.localized_fields_value_sp = localized_fields_value_sp;
	}

	public String getLocalized_fields_value_it() {
		return localized_fields_value_it;
	}

	public void setLocalized_fields_value_it(String localized_fields_value_it) {
		this.localized_fields_value_it = localized_fields_value_it;
	}

	public String getLocalized_fields_value_pt() {
		return localized_fields_value_pt;
	}

	public void setLocalized_fields_value_pt(String localized_fields_value_pt) {
		this.localized_fields_value_pt = localized_fields_value_pt;
	}

	public String getLocalized_fields_value_jp() {
		return localized_fields_value_jp;
	}

	public void setLocalized_fields_value_jp(String localized_fields_value_jp) {
		this.localized_fields_value_jp = localized_fields_value_jp;
	}

	public String getLocalized_fields_value_zh() {
		return localized_fields_value_zh;
	}

	public void setLocalized_fields_value_zh(String localized_fields_value_zh) {
		this.localized_fields_value_zh = localized_fields_value_zh;
	}

	public String getLocalized_fields_value_ko() {
		return localized_fields_value_ko;
	}

	public void setLocalized_fields_value_ko(String localized_fields_value_ko) {
		this.localized_fields_value_ko = localized_fields_value_ko;
	}

	public String getLocalized_fields_value_ru() {
		return localized_fields_value_ru;
	}

	public void setLocalized_fields_value_ru(String localized_fields_value_ru) {
		this.localized_fields_value_ru = localized_fields_value_ru;
	}

	public String getLocalized_fields_value_ar() {
		return localized_fields_value_ar;
	}

	public void setLocalized_fields_value_ar(String localized_fields_value_ar) {
		this.localized_fields_value_ar = localized_fields_value_ar;
	}

	public String getLocalized_fields_value_th() {
		return localized_fields_value_th;
	}

	public void setLocalized_fields_value_th(String localized_fields_value_th) {
		this.localized_fields_value_th = localized_fields_value_th;
	}

	public String getLocalized_fields_value_zt() {
		return localized_fields_value_zt;
	}

	public void setLocalized_fields_value_zt(String localized_fields_value_zt) {
		this.localized_fields_value_zt = localized_fields_value_zt;
	}

	public String getLocalized_fields_value_id() {
		return localized_fields_value_id;
	}

	public void setLocalized_fields_value_id(String localized_fields_value_id) {
		this.localized_fields_value_id = localized_fields_value_id;
	}

	public String getCustom_event_icon_id() {
		return custom_event_icon_id;
	}

	public void setCustom_event_icon_id(String custom_event_icon_id) {
		this.custom_event_icon_id = custom_event_icon_id;
	}

	public String getCustom_event_action_id() {
		return custom_event_action_id;
	}

	public void setCustom_event_action_id(String custom_event_action_id) {
		this.custom_event_action_id = custom_event_action_id;
	}

	public String getCustom_event_action_data() {
		return custom_event_action_data;
	}

	public void setCustom_event_action_data(String custom_event_action_data) {
		this.custom_event_action_data = custom_event_action_data;
	}

	public String getCustom_event_requared_items() {
		return custom_event_requared_items;
	}

	public void setCustom_event_requared_items(
			String custom_event_requared_items) {
		this.custom_event_requared_items = custom_event_requared_items;
	}

	public String getCustom_event_tags() {
		return custom_event_tags;
	}

	public void setCustom_event_tags(String custom_event_tags) {
		this.custom_event_tags = custom_event_tags;
	}

	public String getCustom_event_min_goals_description() {
		return custom_event_min_goals_description;
	}

	public void setCustom_event_min_goals_description(
			String custom_event_min_goals_description) {
		this.custom_event_min_goals_description = custom_event_min_goals_description;
	}

	public String getCustom_event_priority() {
		return custom_event_priority;
	}

	public void setCustom_event_priority(String custom_event_priority) {
		this.custom_event_priority = custom_event_priority;
	}

	public String getCustom_event_versions_list() {
		return custom_event_versions_list;
	}

	public void setCustom_event_versions_list(String custom_event_versions_list) {
		this.custom_event_versions_list = custom_event_versions_list;
	}

	public String getCustom_event_is_vip() {
		return custom_event_is_vip;
	}

	public void setCustom_event_is_vip(String custom_event_is_vip) {
		this.custom_event_is_vip = custom_event_is_vip;
	}

	public String getCountries_filter() {
		return countries_filter;
	}

	public void setCountries_filter(String countries_filter) {
		this.countries_filter = countries_filter;
	}

	public Long getTournament_rank_intervals_value_1_min() {
		return tournament_rank_intervals_value_1_min;
	}

	public void setTournament_rank_intervals_value_1_min(
			Long tournament_rank_intervals_value_1_min) {
		this.tournament_rank_intervals_value_1_min = tournament_rank_intervals_value_1_min;
	}

	public Long getTournament_rank_intervals_value_1_max() {
		return tournament_rank_intervals_value_1_max;
	}

	public void setTournament_rank_intervals_value_1_max(
			Long tournament_rank_intervals_value_1_max) {
		this.tournament_rank_intervals_value_1_max = tournament_rank_intervals_value_1_max;
	}

	public Long getTournament_rank_intervals_value_2_min() {
		return tournament_rank_intervals_value_2_min;
	}

	public void setTournament_rank_intervals_value_2_min(
			Long tournament_rank_intervals_value_2_min) {
		this.tournament_rank_intervals_value_2_min = tournament_rank_intervals_value_2_min;
	}

	public Long getTournament_rank_intervals_value_2_max() {
		return tournament_rank_intervals_value_2_max;
	}

	public void setTournament_rank_intervals_value_2_max(
			Long tournament_rank_intervals_value_2_max) {
		this.tournament_rank_intervals_value_2_max = tournament_rank_intervals_value_2_max;
	}

	public Long getTournament_rank_intervals_value_3_min() {
		return tournament_rank_intervals_value_3_min;
	}

	public void setTournament_rank_intervals_value_3_min(
			Long tournament_rank_intervals_value_3_min) {
		this.tournament_rank_intervals_value_3_min = tournament_rank_intervals_value_3_min;
	}

	public Long getTournament_rank_intervals_value_3_max() {
		return tournament_rank_intervals_value_3_max;
	}

	public void setTournament_rank_intervals_value_3_max(
			Long tournament_rank_intervals_value_3_max) {
		this.tournament_rank_intervals_value_3_max = tournament_rank_intervals_value_3_max;
	}

	public Long getTournament_rank_intervals_value_4_min() {
		return tournament_rank_intervals_value_4_min;
	}

	public void setTournament_rank_intervals_value_4_min(
			Long tournament_rank_intervals_value_4_min) {
		this.tournament_rank_intervals_value_4_min = tournament_rank_intervals_value_4_min;
	}

	public Long getTournament_rank_intervals_value_4_max() {
		return tournament_rank_intervals_value_4_max;
	}

	public void setTournament_rank_intervals_value_4_max(
			Long tournament_rank_intervals_value_4_max) {
		this.tournament_rank_intervals_value_4_max = tournament_rank_intervals_value_4_max;
	}

	public Long getTournament_rank_intervals_value_5_min() {
		return tournament_rank_intervals_value_5_min;
	}

	public void setTournament_rank_intervals_value_5_min(
			Long tournament_rank_intervals_value_5_min) {
		this.tournament_rank_intervals_value_5_min = tournament_rank_intervals_value_5_min;
	}

	public Long getTournament_rank_intervals_value_5_max() {
		return tournament_rank_intervals_value_5_max;
	}

	public void setTournament_rank_intervals_value_5_max(
			Long tournament_rank_intervals_value_5_max) {
		this.tournament_rank_intervals_value_5_max = tournament_rank_intervals_value_5_max;
	}

	public String getTournament_gifts_value_1() {
		return tournament_gifts_value_1;
	}

	public void setTournament_gifts_value_1(String tournament_gifts_value_1) {
		this.tournament_gifts_value_1 = tournament_gifts_value_1;
	}

	public String getTournament_gifts_value_2() {
		return tournament_gifts_value_2;
	}

	public void setTournament_gifts_value_2(String tournament_gifts_value_2) {
		this.tournament_gifts_value_2 = tournament_gifts_value_2;
	}

	public String getTournament_gifts_value_3() {
		return tournament_gifts_value_3;
	}

	public void setTournament_gifts_value_3(String tournament_gifts_value_3) {
		this.tournament_gifts_value_3 = tournament_gifts_value_3;
	}

	public String getTournament_gifts_value_4() {
		return tournament_gifts_value_4;
	}

	public void setTournament_gifts_value_4(String tournament_gifts_value_4) {
		this.tournament_gifts_value_4 = tournament_gifts_value_4;
	}

	public String getTournament_gifts_value_5() {
		return tournament_gifts_value_5;
	}

	public void setTournament_gifts_value_5(String tournament_gifts_value_5) {
		this.tournament_gifts_value_5 = tournament_gifts_value_5;
	}

	public String getTournament_type() {
		return tournament_type;
	}

	public void setTournament_type(String tournament_type) {
		this.tournament_type = tournament_type;
	}

	public String getTournament_delivery() {
		return tournament_delivery;
	}

	public void setTournament_delivery(String tournament_delivery) {
		this.tournament_delivery = tournament_delivery;
	}

	public String getLeaderboard_order() {
		return leaderboard_order;
	}

	public void setLeaderboard_order(String leaderboard_order) {
		this.leaderboard_order = leaderboard_order;
	}

	public String getLeaderboard_type() {
		return leaderboard_type;
	}

	public void setLeaderboard_type(String leaderboard_type) {
		this.leaderboard_type = leaderboard_type;
	}

	public Long getLeaderboard_group_size() {
		return leaderboard_group_size;
	}

	public void setCustom_event_long_description(
			String custom_event_long_description) {
		this.custom_event_long_description = custom_event_long_description;
	}

	public void setLeaderboard_group_size(Long long1) {
		this.leaderboard_group_size = long1;
	}

	public class TournamentGifts {
		String name;
		int value;
	}

	@Override
	public String toString() {
		return "GameEvent [event_name=" + event_name + "\n event_description="
				+ event_description + "\n custom_event_type="
				+ custom_event_type + "\n custom_event_title="
				+ custom_event_title + "\n custom_event_long_description="
				+ custom_event_long_description + "\n custom_event_icon_id="
				+ custom_event_icon_id + "\n custom_event_action_id="
				+ custom_event_action_id + "\n custom_event_action_data="
				+ custom_event_action_data + "\n custom_event_requared_items="
				+ custom_event_requared_items + "\n custom_event_tags="
				+ custom_event_tags + "\n custom_event_min_goals="
				+ custom_event_min_goals
				+ "\n custom_event_min_goals_description="
				+ custom_event_min_goals_description
				+ "\n custom_event_priority=" + custom_event_priority
				+ "\n custom_event_versions_list=" + custom_event_versions_list
				+ "\n custom_event_is_vip=" + custom_event_is_vip
				+ "\n countries_filter=" + countries_filter
				+ "\n tournament_rank_intervals_value_1_min="
				+ tournament_rank_intervals_value_1_min
				+ "\n tournament_rank_intervals_value_1_max="
				+ tournament_rank_intervals_value_1_max
				+ "\n tournament_rank_intervals_value_2_min="
				+ tournament_rank_intervals_value_2_min
				+ "\n tournament_rank_intervals_value_2_max="
				+ tournament_rank_intervals_value_2_max
				+ "\n tournament_rank_intervals_value_3_min="
				+ tournament_rank_intervals_value_3_min
				+ "\n tournament_rank_intervals_value_3_max="
				+ tournament_rank_intervals_value_3_max
				+ "\n tournament_rank_intervals_value_4_min="
				+ tournament_rank_intervals_value_4_min
				+ "\n tournament_rank_intervals_value_4_max="
				+ tournament_rank_intervals_value_4_max
				+ "\n tournament_rank_intervals_value_5_min="
				+ tournament_rank_intervals_value_5_min
				+ "\n tournament_rank_intervals_value_5_max="
				+ tournament_rank_intervals_value_5_max
				+ "\n tournament_gifts_value_1=" + tournament_gifts_value_1
				+ "\n tournament_gifts_value_2=" + tournament_gifts_value_2
				+ "\n tournament_gifts_value_3=" + tournament_gifts_value_3
				+ "\n tournament_gifts_value_4=" + tournament_gifts_value_4
				+ "\n tournament_gifts_value_5=" + tournament_gifts_value_5
				+ "\n tournament_gifts_name_1=" + tournament_gifts_name_1
				+ "\n tournament_gifts_name_2=" + tournament_gifts_name_2
				+ "\n tournament_gifts_name_3=" + tournament_gifts_name_3
				+ "\n tournament_gifts_name_4=" + tournament_gifts_name_4
				+ "\n tournament_gifts_name_5=" + tournament_gifts_name_5
				+ "\n tournament_gifts_value_1_vip="
				+ tournament_gifts_value_1_vip
				+ "\n tournament_gifts_value_2_vip="
				+ tournament_gifts_value_2_vip
				+ "\n tournament_gifts_value_3_vip="
				+ tournament_gifts_value_3_vip
				+ "\n tournament_gifts_value_4_vip="
				+ tournament_gifts_value_4_vip
				+ "\n tournament_gifts_value_5_vip="
				+ tournament_gifts_value_5_vip
				+ "\n tournament_gifts_name_1_vip="
				+ tournament_gifts_name_1_vip
				+ "\n tournament_gifts_name_2_vip="
				+ tournament_gifts_name_2_vip
				+ "\n tournament_gifts_name_3_vip="
				+ tournament_gifts_name_3_vip
				+ "\n tournament_gifts_name_4_vip="
				+ tournament_gifts_name_4_vip
				+ "\n tournament_gifts_name_5_vip="
				+ tournament_gifts_name_5_vip
				+ "\n localized_fields_value_default="
				+ localized_fields_value_default
				+ "\n localized_fields_value_en=" + localized_fields_value_en
				+ "\n localized_fields_value_fr=" + localized_fields_value_fr
				+ "\n localized_fields_value_de=" + localized_fields_value_de
				+ "\n localized_fields_value_sp=" + localized_fields_value_sp
				+ "\n localized_fields_value_it=" + localized_fields_value_it
				+ "\n localized_fields_value_pt=" + localized_fields_value_pt
				+ "\n localized_fields_value_jp=" + localized_fields_value_jp
				+ "\n localized_fields_value_zh=" + localized_fields_value_zh
				+ "\n localized_fields_value_ko=" + localized_fields_value_ko
				+ "\n localized_fields_value_ru=" + localized_fields_value_ru
				+ "\n localized_fields_value_ar=" + localized_fields_value_ar
				+ "\n localized_fields_value_th=" + localized_fields_value_th
				+ "\n localized_fields_value_zt=" + localized_fields_value_zt
				+ "\n localized_fields_value_id=" + localized_fields_value_id
				+ "\n tournament_type=" + tournament_type
				+ "\n tournament_delivery=" + tournament_delivery
				+ "\n leaderboard_order=" + leaderboard_order
				+ "\n leaderboard_type=" + leaderboard_type
				+ "\n leaderboard_group_size=" + leaderboard_group_size + "]";
	}
	
}
