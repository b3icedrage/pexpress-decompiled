package defpackage;

import io.sentry.android.core.b0;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.webpage.downloads.WebViewDownloadsBase$onBlobReply$1", f = "WebViewDownloadsBase.kt", l = {145}, m = "invokeSuspend")
public final class Jh2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Hh2 e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;

    @InterfaceC3368dU(c = "com.base.feature.webpage.downloads.WebViewDownloadsBase$onBlobReply$1$result$1", f = "WebViewDownloadsBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super InterfaceC5947pX>, Object> {
        public final /* synthetic */ Hh2 d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String g;
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Hh2 hh2, String str, String str2, boolean z, JM<? super a> jm) {
            super(2, jm);
            this.d = hh2;
            this.e = str;
            this.g = str2;
            this.h = z;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.d, this.e, this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super InterfaceC5947pX> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            C5641o30 c5641o30;
            C1553Ms.a aVarRemove;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            Hh2 hh2 = this.d;
            String message = this.e;
            String sourceOrigin = this.g;
            boolean z = this.h;
            Set<String> set = Hh2.i;
            hh2.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                JSONObject jSONObject = new JSONObject(message);
                String string = jSONObject.getString("t");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String strOptString = jSONObject.optString("d");
                if (strOptString.length() == 0) {
                    strOptString = null;
                }
                String strOptString2 = jSONObject.optString(R51.PUSH_MINIFIED_BUTTON_TEXT);
                if (strOptString2.length() == 0) {
                    strOptString2 = null;
                }
                String strOptString3 = jSONObject.optString("e");
                if (strOptString3.length() == 0) {
                    strOptString3 = null;
                }
                c5641o30 = new C5641o30(string, strOptString, strOptString2, strOptString3);
            } catch (JSONException unused) {
                c5641o30 = null;
            }
            if (c5641o30 == null) {
                return null;
            }
            C1553Ms c1553Ms = hh2.d;
            String token = c5641o30.a;
            synchronized (c1553Ms) {
                Intrinsics.checkNotNullParameter(token, "token");
                Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
                aVarRemove = c1553Ms.a.remove(token);
                if (aVarRemove == null) {
                    aVarRemove = null;
                } else {
                    boolean z2 = ((Number) Hh2.b.m.invoke()).longValue() - aVarRemove.d <= 60000;
                    String lowerCase = StringsKt.e0(StringsKt.d0(sourceOrigin).toString(), '/').toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    boolean zA = Intrinsics.a(lowerCase, aVarRemove.c);
                    if (!z2 || !z || !zA) {
                        aVarRemove = null;
                    }
                }
            }
            if (aVarRemove == null) {
                b0.e("WebViewDownloads", "blob reply rejected mainFrame=" + z);
                return null;
            }
            String dataUrl = c5641o30.b;
            if (dataUrl != null) {
                Intrinsics.checkNotNullParameter(dataUrl, "dataUrl");
                if (dataUrl.length() <= 27963048) {
                    return hh2.b(dataUrl, aVarRemove.a, aVarRemove.b, c5641o30.c);
                }
            }
            String str = c5641o30.d;
            if (str == null) {
                str = "too large";
            }
            b0.e("WebViewDownloads", "blob read failed: ".concat(str));
            return InterfaceC5947pX.a.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jh2(Hh2 hh2, String str, String str2, boolean z, JM<? super Jh2> jm) {
        super(2, jm);
        this.e = hh2;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Jh2(this.e, this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Jh2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            a aVar = new a(this.e, this.g, this.h, this.i, null);
            this.d = 1;
            obj = C5189lv.p(executorC7200vV, aVar, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        InterfaceC5947pX interfaceC5947pX = (InterfaceC5947pX) obj;
        if (interfaceC5947pX != null) {
            Set<String> set = Hh2.i;
            this.e.c(interfaceC5947pX);
        }
        return Unit.a;
    }
}
