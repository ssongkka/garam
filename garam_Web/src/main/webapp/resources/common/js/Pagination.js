var listSize = 20; // 초기값으로 목록개수를 10으로 셋팅

var rangeSize = 10; // 초기값으로 페이지범위를 10으로 셋팅

var page;

var range;

var listCnt;

var pageCnt;

var startPage;

var startList;

var endPage;

var prev;

var next;



var gsListSize = {
	get gListSize() {
		return listSize;
	},
	set sListSize(num) {
		listSize = num;
	}
}

var gsRangeSize = {
	get gPage() {
		return rangeSize;
	},
	set sPage(num) {
		rangeSize = num;
	}
}

var gsPage = {
	get gPage() {
		return page;
	},
	set sPage(num) {
		page = num;
	}
}

var gsRange = {
	get gRange() {
		return range;
	},
	set sRange(num) {
		range = num;
	}
}

var gsListCnt = {
	get gListCnt() {
		return listCnt;
	},
	set sListCnt(num) {
		listCnt = num;
	}
}

var gsPageCnt = {
	get gPageCnt() {
		return pageCnt;
	},
	set sPageCnt(num) {
		pageCnt = num;
	}
}

var gsStartPage = {
	get gStartPage() {
		return startPage;
	},
	set sStartPage(num) {
		startPage = num;
	}
}

var gsStartList = {
	get gStartList() {
		return startList;
	},
	set sStartList(num) {
		startList = num;
	}
}

var gsEndPage = {
	get gEndPage() {
		return endPage;
	},
	set sEndPage(num) {
		endPage = num;
	}
}

var gsPrev = {
	get gPrev() {
		return prev;
	},
	set sPrev(bl) {
		prev = bl;
	}
}

var gsNext = {
	get gNext() {
		return next;
	},
	set sNext(bl) {
		next = bl;
	}
}

function fnPageInfo(page, range, listCnt) {
	gsPage.sPage = page;

	gsRange.sRange = range;

	gsListCnt.sListCnt = listCnt;

	console.log("12311323   " + listCnt / listSize);
	console.log("12311323   " + Math.ceil(listCnt / listSize));

	gsPageCnt.sPageCnt = Math.ceil(listCnt / listSize);

	gsStartPage.sStartPage = (range - 1) * rangeSize + 1;

	gsEndPage.sEndPage = range * rangeSize;

	gsStartList.sStartList = (page - 1) * listSize;

	gsPrev.sPrev = range == 1 ? false : true;

	gsNext.sNext = pageCnt > endPage ? true : false;

	if (gsEndPage.gEndPage > gsPageCnt.gPageCnt) {

		gsEndPage.sEndPage = gsPageCnt.gPageCnt;

		gsNext.sNext = false;
	}
}