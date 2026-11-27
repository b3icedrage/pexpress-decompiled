package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.model.repository.contacts.ContactForm;
import com.jivosite.sdk.ui.chat.JivoChatFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5281mL implements InterfaceC4819k81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C5281mL(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                EY0 this_apply = (EY0) this.b;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                ContactForm contactForm = ((C3970gL) obj).a.b;
                if (contactForm == null || (str = contactForm.a) == null) {
                    str = "";
                }
                this_apply.k(str);
                break;
            default:
                String incompleteText = (String) obj;
                JivoChatFragment this$0 = (JivoChatFragment) this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SF0 sf0I = this$0.i();
                Intrinsics.checkNotNullExpressionValue(incompleteText, "it");
                sf0I.getClass();
                Intrinsics.checkNotNullParameter(incompleteText, "incompleteText");
                String clientId = sf0I.e.getId();
                Intrinsics.checkNotNullParameter(incompleteText, "incompleteText");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                sf0I.l.a(new SocketMessage("atom/user.typing", incompleteText, clientId, null, null, null, null, 120, null));
                break;
        }
    }
}
