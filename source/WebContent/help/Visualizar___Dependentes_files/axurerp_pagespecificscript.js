﻿for(var i = 0; i < 9; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u4'] = 'center';
u5.style.cursor = 'pointer';
if (bIE) u5.attachEvent("onclick", ClickLinkToReferencePageu5);
else u5.addEventListener("click", ClickLinkToReferencePageu5, true);
function ClickLinkToReferencePageu5(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dependentes.html');
}

x = 0;
y = 17;
InsertAfterBegin(u5ann, "<img src='resources/images/newwindow.gif' id='u5PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u5PagePopup = document.getElementById('u5PagePopup');
if (bIE) u5PagePopup.attachEvent("onclick", u5PagePopupHandler);
else u5PagePopup.addEventListener("click", u5PagePopupHandler, true);

function u5PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dependentes.html'));
}
gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u2'] = 'top';