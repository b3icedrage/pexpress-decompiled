package defpackage;

import android.webkit.WebSettings;
import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* JADX INFO: renamed from: dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3410dg implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C3410dg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((NR) this.e).getClass();
                return Unit.a;
            case 1:
                ((C2084Tm) this.e).B();
                return Unit.a;
            case 2:
                MR1 mr1 = (MR1) this.e;
                InterfaceC1442Lg1 interfaceC1442Lg1 = mr1.b;
                Intrinsics.checkNotNullParameter(interfaceC1442Lg1, "<this>");
                return new MR1.a(interfaceC1442Lg1.a(mr1));
            case 3:
                return ((SupportIssueCategoriesPartBase) this.e).l;
            default:
                String defaultUserAgent = WebSettings.getDefaultUserAgent(((Sa2) this.e).a);
                Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "getDefaultUserAgent(...)");
                return d.m(defaultUserAgent, "; wv", "");
        }
    }
}
