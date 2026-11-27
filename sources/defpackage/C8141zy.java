package defpackage;

import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import com.impl.feature.webpageinapp.screens.privacypolicy.PlatformPrivacyPolicyWebViewFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8141zy implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C8141zy(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                FF ff = (FF) ((AbstractC1104Gy) obj).d.b.getValue();
                if (ff != null) {
                    return ff.B;
                }
                return null;
            case 1:
                int i = ActivityC6781tV0.Q;
                Sd2 sd2 = ((ActivityC6781tV0) obj).e;
                if (sd2 != null) {
                    return sd2;
                }
                Intrinsics.l("viewModelFactory");
                throw null;
            case 2:
                return ((PlatformPrivacyPolicyWebViewFragmentImpl) obj).q;
            case 3:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = (WebViewFileChooserUseCaseBase) obj;
                webViewFileChooserUseCaseBase.e(false);
                webViewFileChooserUseCaseBase.i(new C6425rm1(2));
                return Unit.a;
        }
    }
}
