package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class E70 extends P80 {

    @InterfaceC2691aI1("code")
    @Nullable
    public final String a;

    @InterfaceC2691aI1("message")
    @Nullable
    public final String b;

    @InterfaceC2691aI1("platformCode")
    @Nullable
    public final String c;

    @InterfaceC2691aI1("background")
    @Nullable
    public final Boolean d;

    @InterfaceC2691aI1("description")
    @Nullable
    public final String e;

    @InterfaceC2691aI1("step")
    @Nullable
    public final String f;

    @InterfaceC2691aI1("retry")
    @Nullable
    public final Boolean g;

    @InterfaceC2691aI1("auth_attempt_id")
    @Nullable
    public final String h;

    @InterfaceC2691aI1("auth_attempt_number")
    @Nullable
    public final Integer i;

    @InterfaceC2691aI1("error_class")
    @Nullable
    public final String j;

    @InterfaceC2691aI1("http_status")
    @Nullable
    public final Object k;

    @InterfaceC2691aI1("domain")
    @Nullable
    public final Object l;

    @InterfaceC2691aI1("try")
    @Nullable
    public final Object m;

    public static final class a {
        public static E70 a(CommonError error, String str, String str2, Integer num, int i) {
            String str3 = (i & 2) != 0 ? null : str;
            String str4 = (i & 8) != 0 ? null : str2;
            Integer num2 = (i & 16) != 0 ? null : num;
            Intrinsics.checkNotNullParameter(error, "error");
            Map<String, Object> http = error.getHttp();
            String strValueOf = String.valueOf(error.getCode());
            String text = error.getText();
            String platformCode = error.getPlatformCode();
            if (platformCode.length() == 0) {
                platformCode = null;
            }
            return new E70(strValueOf, text, platformCode, null, null, str3, null, str4, num2, C2017Sp1.a.b(error.getClass()).f(), http.get("status"), http.get("domain"), http.get("try"), 24);
        }
    }

    public E70(String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2, String str6, Integer num, String str7, Object obj, Object obj2, Object obj3, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        Boolean bool3 = (i & 8) != 0 ? null : bool;
        String str8 = (i & 16) != 0 ? null : str4;
        String str9 = (i & 32) != 0 ? null : str5;
        Boolean bool4 = (i & 64) != 0 ? null : bool2;
        String str10 = (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str6;
        Integer num2 = (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : num;
        String str11 = (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str7;
        Object obj4 = (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : obj;
        Object obj5 = (i & 2048) != 0 ? null : obj2;
        Object obj6 = (i & 4096) == 0 ? obj3 : null;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool3;
        this.e = str8;
        this.f = str9;
        this.g = bool4;
        this.h = str10;
        this.i = num2;
        this.j = str11;
        this.k = obj4;
        this.l = obj5;
        this.m = obj6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E70)) {
            return false;
        }
        E70 e70 = (E70) obj;
        return Intrinsics.a(this.a, e70.a) && Intrinsics.a(this.b, e70.b) && Intrinsics.a(this.c, e70.c) && Intrinsics.a(this.d, e70.d) && Intrinsics.a(this.e, e70.e) && Intrinsics.a(this.f, e70.f) && Intrinsics.a(this.g, e70.g) && Intrinsics.a(this.h, e70.h) && Intrinsics.a(this.i, e70.i) && Intrinsics.a(this.j, e70.j) && Intrinsics.a(this.k, e70.k) && Intrinsics.a(this.l, e70.l) && Intrinsics.a(this.m, e70.m);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Object obj = this.k;
        int iHashCode11 = (iHashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.l;
        int iHashCode12 = (iHashCode11 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.m;
        return iHashCode12 + (obj3 != null ? obj3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorProperty(code=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", platformCode=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", step=");
        sb.append(this.f);
        sb.append(", retry=");
        sb.append(this.g);
        sb.append(", authAttemptId=");
        sb.append(this.h);
        sb.append(", authAttemptNumber=");
        sb.append(this.i);
        sb.append(", errorClass=");
        sb.append(this.j);
        sb.append(", httpStatus=");
        sb.append(this.k);
        sb.append(", domain=");
        sb.append(this.l);
        sb.append(", requestTry=");
        return K1.a(sb, this.m, ")");
    }
}
