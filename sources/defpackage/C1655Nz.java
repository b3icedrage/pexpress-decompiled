package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.URL;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1655Nz implements UB0 {

    @NotNull
    public final EK1 a;

    public C1655Nz(@NotNull EK1 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = storage;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4543is1 c4543is1 = chain.e;
        C1318Jr0 c1318Jr0 = c4543is1.a;
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        String lowerCase = language.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String str = Intrinsics.a(lowerCase, "ru") ? "jivo.ru" : "jivosite.com";
        C1318Jr0.a aVarF = c1318Jr0.f();
        Intrinsics.checkNotNullParameter(ImagesContract.URL, AppMeasurementSdk.ConditionalUserProperty.NAME);
        for (String str2 : c4543is1.c.h(ImagesContract.URL)) {
            int iHashCode = str2.hashCode();
            EK1 ek1 = this.a;
            switch (iHashCode) {
                case 96794:
                    if (str2.equals("api")) {
                        ek1.getClass();
                        aVarF.d((String) ek1.f.a(EK1.z[5], ek1));
                    }
                    break;
                case 113722:
                    if (str2.equals("sdk")) {
                        ek1.getClass();
                        String str3 = (String) ek1.h.a(EK1.z[7], ek1);
                        if (StringsKt.I(str3)) {
                            str3 = str;
                        }
                        aVarF.d("sdk.".concat(str3));
                    }
                    break;
                case 3386882:
                    if (str2.equals("node")) {
                        StringBuilder sb = new StringBuilder("https://");
                        ek1.getClass();
                        sb.append((String) ek1.e.a(EK1.z[4], ek1));
                        URL url = new URL(sb.toString());
                        String host = url.getHost();
                        Intrinsics.checkNotNullExpressionValue(host, "url.host");
                        aVarF.d(host);
                        if (url.getPort() != -1) {
                            aVarF.f(url.getPort());
                        }
                    }
                    break;
                case 3452698:
                    if (str2.equals("push")) {
                        ek1.getClass();
                        String str4 = (String) ek1.h.a(EK1.z[7], ek1);
                        if (StringsKt.I(str4)) {
                            str4 = str;
                        }
                        aVarF.d("push.".concat(str4));
                    }
                    break;
                case 780346297:
                    if (str2.equals("telemetry")) {
                        ek1.getClass();
                        String str5 = (String) ek1.h.a(EK1.z[7], ek1);
                        if (StringsKt.I(str5)) {
                            str5 = str;
                        }
                        aVarF.d("telemetry.".concat(str5));
                    }
                    break;
            }
        }
        C1318Jr0 url2 = aVarF.a();
        C4543is1.a aVarB = c4543is1.b();
        aVarB.f(ImagesContract.URL);
        Intrinsics.checkNotNullParameter(url2, "url");
        aVarB.a = url2;
        return chain.b(aVarB.b());
    }
}
