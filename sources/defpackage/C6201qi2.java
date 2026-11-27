package defpackage;

import io.sentry.android.core.b0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6201qi2 {

    @NotNull
    public final LinkedHashMap a = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull String url, @NotNull LM lm) throws Throwable {
        C5781oi2 c5781oi2;
        C6201qi2 c6201qi2;
        if (lm instanceof C5781oi2) {
            c5781oi2 = (C5781oi2) lm;
            int i = c5781oi2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5781oi2.i = i - Integer.MIN_VALUE;
            } else {
                c5781oi2 = new C5781oi2(this, lm);
            }
        } else {
            c5781oi2 = new C5781oi2(this, lm);
        }
        Object obj = c5781oi2.g;
        Object obj2 = MN.d;
        int i2 = c5781oi2.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            c5781oi2.d = this;
            c5781oi2.e = url;
            c5781oi2.i = 1;
            Object objP = C5189lv.p(C6266r20.c, new C5991pi2(this, url, null), c5781oi2);
            if (objP != obj2) {
                objP = Unit.a;
            }
            if (objP == obj2) {
                return obj2;
            }
            c6201qi2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = c5781oi2.e;
            c6201qi2 = c5781oi2.d;
            C1795Pt1.b(obj);
        }
        c6201qi2.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        String str = (String) c6201qi2.a.get(url);
        if (str != null) {
            return str;
        }
        b0.c("WebViewScriptsManager", "loadAndGetScript: Script should be loaded now");
        return "";
    }
}
