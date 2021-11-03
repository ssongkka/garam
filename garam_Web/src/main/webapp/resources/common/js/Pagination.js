class pageCla {
	constructor(page, listcnt, listsize, rangesize) {
		this.listSize = listsize;
		this.paGe = Math.floor(page / this.listSize) + 1;
		console.log("1this.listSize  " + this.listSize);
		this.ranGe = Math.floor(this.paGe / rangesize + 1);
		console.log("2this.listSize  " + this.listSize);
		this.listCnt = listcnt;
		console.log("3this.listSize  " + this.listSize);
		console.log("4this.listSize  " + this.listSize);
		this.rangeSize = rangesize;
		console.log("5this.listSize  " + this.listSize);

		this.pageCnt = Math.ceil(this.listCnt / this.listSize);
		console.log("6this.listSize  " + this.listSize);
		this.startPage = (this.ranGe - 1) * this.rangeSize + 1;
		console.log("7this.listSize  " + this.listSize);
		this.endPage = this.ranGe * this.rangeSize;
		console.log("8this.listSize  " + this.listSize);
		this.startList = (this.paGe - 1) * this.listSize;
		console.log("9this.listSize  " + this.listSize);
		this.prEv = this.ranGe == 1 ? false : true;
		console.log("10this.listSize  " + this.listSize);
		this.neXt = this.pageCnt > this.endPage ? true : false;
		console.log("11this.listSize  " + this.listSize);

		if (this.endPage > this.pageCnt) {
			this.endPage = this.pageCnt;
			this.neXt = false;
		}
		console.log("1this.listSize  " + this.listSize);
		console.log("1this.paGe  " + this.paGe);
		console.log("1this.ranGe  " + this.ranGe);
		console.log("1this.listCnt  " + this.listCnt);
		console.log("1this.listSize  " + this.listSize);
		console.log("1this.rangeSize  " + this.rangeSize);
		console.log("1this.pageCnt  " + this.pageCnt);
		console.log("1this.startPage  " + this.startPage);
		console.log("1this.endPage  " + this.endPage);
		console.log("1this.startList  " + this.startList);
		console.log("1this.prEv  " + this.prEv);
		console.log("1this.neXt " + this.neXt);
	}
	get listSize() {
		return this.list_Size;
	}
	set listSize(num) {
		this.list_Size = num;
	}

	get rangeSize() {
		return this.range_Size;
	}
	set rangeSize(num) {
		this.range_Size = num;
	}

	get paGe() {
		return this.p_age;
	}
	set paGe(num) {
		this.p_age = num;
	}

	get ranGe() {
		return this.r_Ange;
	}
	set ranGe(num) {
		this.r_Ange = num;
	}

	get listCnt() {
		return this.list_Cnt;
	}
	set listCnt(num) {
		this.list_Cnt = num;
	}

	get pageCnt() {
		return this.page_Cnt;
	}
	set pageCnt(num) {
		this.page_Cnt = num;
	}

	get startPage() {
		return this.start_Page;
	}
	set startPage(num) {
		this.start_Page = num;
	}

	get startList() {
		return this.start_List;
	}
	set startList(num) {
		this.start_List = num;
	}

	get endPage() {
		return this.end_Page;
	}
	set endPage(num) {
		this.end_Page = num;
	}

	get prEv() {
		return this.p_rev;
	}
	set prEv(bl) {
		this.p_rev = bl;
	}

	get neXt() {
		return this.n_ext;
	}
	set neXt(bl) {
		this.n_ext = bl;
	}

}
