package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.api.feature.analytics.reporters.ReporterApi;
import com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment;
import com.base.feature.webpage.screens.knowledgeBase.KnowledgeBaseFragmentBase;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7239vg implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C7239vg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((C6819tg) this.e).invoke();
                return Unit.a;
            case 1:
                EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment = (EmailAndPasswordFieldsFragment) this.e;
                Intrinsics.checkNotNullParameter(emailAndPasswordFieldsFragment, "<this>");
                Context contextRequireContext = emailAndPasswordFieldsFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Intrinsics.checkNotNullParameter(contextRequireContext, "<this>");
                Intrinsics.checkNotNullParameter(contextRequireContext, "<this>");
                Drawable drawable = C6333rM.getDrawable(contextRequireContext, R.drawable.ic_password_text_input_layout_visibility_selector);
                if (drawable != null) {
                    return drawable;
                }
                throw new IllegalStateException("Returned drawable was null due to an internal error.");
            case 2:
                return ((KnowledgeBaseFragmentBase) this.e).q;
            case 3:
                InterfaceC6168qa1.a aVar = ((C6797ta1) this.e).c;
                if (aVar != null) {
                    return aVar.b;
                }
                return null;
            case 4:
                ((C1259Ix1) this.e).e.a();
                return Unit.a;
            case 5:
                C5189lv.k(C3286d41.a, C6266r20.a, new C2623Zz1((C4617jA1) this.e, null), 2);
                return Unit.a;
            case 6:
                return this.e;
            default:
                C6572sV1 c6572sV1 = (C6572sV1) this.e;
                c6572sV1.getClass();
                ReporterApi.a.b(c6572sV1.e, EnumC5028l80.y0, new C1510Md1("FAQ"), null, 12);
                c6572sV1.d.a();
                return Unit.a;
        }
    }
}
