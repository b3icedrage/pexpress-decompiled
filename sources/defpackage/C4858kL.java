package defpackage;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4858kL implements InterfaceC4819k81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C4858kL(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(Object obj) {
        SF0.c cVarA;
        switch (this.a) {
            case 0:
                Boolean it = (Boolean) obj;
                C5068lL this$0 = (C5068lL) this.c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                AppCompatTextView appCompatTextView = ((D00) this.b).y;
                Context contextR = this$0.r();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                appCompatTextView.setText(contextR.getString(it.booleanValue() ? R.string.chat_system_contact_form_introduce_in_chat : R.string.chat_system_contact_form_must_fill));
                break;
            default:
                HF1 it2 = (HF1) obj;
                EY0 this_apply = (EY0) this.b;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0 this$1 = (SF0) this.c;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                SF0.c cVar = (SF0.c) this_apply.d();
                if (cVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    cVarA = SF0.c.a(cVar, null, false, null, it2, null, null, null, null, null, null, 2031);
                } else {
                    cVarA = null;
                }
                this_apply.k(cVarA);
                SF0.c cVar2 = (SF0.c) this_apply.d();
                if (cVar2 != null) {
                    this$1.l(cVar2);
                    break;
                }
                break;
        }
    }
}
