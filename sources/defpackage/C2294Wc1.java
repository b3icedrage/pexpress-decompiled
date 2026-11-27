package defpackage;

import android.net.Uri;
import android.webkit.ValueCallback;
import io.sentry.android.core.b0;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2294Wc1 {

    @Nullable
    public ValueCallback<Uri[]> a;

    public final boolean a(@Nullable Uri[] uriArr) {
        Object objA;
        ValueCallback<Uri[]> valueCallback = this.a;
        if (valueCallback == null) {
            return false;
        }
        this.a = null;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            valueCallback.onReceiveValue(uriArr);
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA == null) {
            return true;
        }
        b0.d("PendingChooser", "showFileChooser result was already delivered", thA);
        return true;
    }
}
