package defpackage;

import android.content.Context;
import com.google.android.material.button.MaterialButton;
import com.jivosite.sdk.model.pojo.message.ClientMessage;
import com.pexpress.tool.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4648jL implements InterfaceC4819k81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C4648jL(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(Object obj) {
        ClientMessage clientMessage;
        switch (this.a) {
            case 0:
                Boolean it = (Boolean) obj;
                C5068lL this$0 = (C5068lL) this.c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MaterialButton materialButton = ((D00) this.b).z;
                Context contextR = this$0.r();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                materialButton.setText(contextR.getString(it.booleanValue() ? R.string.contact_form_status_sent : R.string.common_send));
                break;
            default:
                C3513e9 c3513e9 = (C3513e9) obj;
                SF0 this$1 = (SF0) this.b;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                EY0 this_apply = (EY0) this.c;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                SF0.c cVar = (SF0.c) this_apply.d();
                if (cVar != null) {
                    this$1.l(cVar);
                    List<C7129v8> list = c3513e9.b;
                    if (list == null || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.a(((C7129v8) it2.next()).b, AbstractC3723f9.b.a)) {
                                SF0.c cVar2 = (SF0.c) this_apply.d();
                                if (cVar2 != null && (clientMessage = cVar2.h.a) != null) {
                                    this$1.n(clientMessage);
                                    this$1.q.z();
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}
