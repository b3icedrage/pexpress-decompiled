package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import io.sentry.android.core.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Th2 implements Function0 {
    public final /* synthetic */ WebViewFileChooserUseCaseBase d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ Th2(WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase, Function0 function0) {
        this.d = webViewFileChooserUseCaseBase;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        ActivityC1745Pd activityC1745Pd = this.d.a;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", activityC1745Pd.getPackageName(), null));
            activityC1745Pd.startActivity(intent);
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.d("WebViewFileChooser", "Cannot open app settings", thA);
        }
        this.e.invoke();
        return Unit.a;
    }
}
