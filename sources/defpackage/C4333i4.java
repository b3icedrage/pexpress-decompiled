package defpackage;

import android.content.Context;
import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import com.base.feature.stub.screens.onboarding.page_item.StubOnboardingItemFragment;
import com.impl.feature.robot.account.AccountSelectionFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4333i4 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4333i4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                return ((AccountSelectionFragmentImpl) obj).m;
            case 1:
                int i = ActivityC6781tV0.Q;
                Context context = ((ActivityC6781tV0) obj).getApplicationContext();
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullParameter(context, "context");
                if (C7279vr.d == null) {
                    C7279vr.d = new C3362dS(new C7700xr(context), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
                }
                C3362dS c3362dS = C7279vr.d;
                Intrinsics.checkNotNull(c3362dS);
                return new C3152cS(c3362dS.a, new C6621sj());
            case 2:
                return ((StubOnboardingItemFragment) obj).k;
            default:
                WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = (WebViewFileChooserUseCaseBase) obj;
                webViewFileChooserUseCaseBase.o.a(webViewFileChooserUseCaseBase.b.a());
                return Unit.a;
        }
    }
}
