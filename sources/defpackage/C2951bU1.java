package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2951bU1 implements ZT1 {

    @NotNull
    public final Context a;

    @NotNull
    public final InterfaceC1446Li b;

    /* JADX INFO: renamed from: bU1$a */
    @InterfaceC3368dU(c = "com.base.feature.analytics.providers.SubIdProviderBase$getSubId$2", f = "SubIdProviderBase.kt", l = {37}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super String>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2951bU1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super String> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C2951bU1 c2951bU1 = C2951bU1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                String strC = c2951bU1.c();
                if (strC != null) {
                    return strC;
                }
                this.d = 1;
                obj = c2951bU1.d(this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            String str = (String) obj;
            return str == null ? c2951bU1.b() : str;
        }
    }

    public C2951bU1(@NotNull Context context, @NotNull InterfaceC1446Li applicationVersionProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationVersionProvider, "applicationVersionProvider");
        this.a = context;
        this.b = applicationVersionProvider;
        XO0.b(new C4(this, 6));
    }

    @Override // defpackage.ZT1
    @Nullable
    public final Object a(@NotNull JM<? super String> jm) {
        return C5189lv.p(C6266r20.a, new a(null), jm);
    }

    @Override // defpackage.ZT1
    @SuppressLint({"HardwareIds"})
    @NotNull
    public final String b() {
        String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r1v1, types: [Ot1$b] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.ZT1
    @Nullable
    public final String c() {
        ?? A;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            try {
                A = e();
            } catch (Exception unused) {
                A = 0;
            }
            if (A != 0) {
                StringBuilder sb = new StringBuilder();
                int length = A.length();
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = A.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (string != null) {
                    while (true) {
                        if (i >= string.length()) {
                            A = 0;
                            break;
                        }
                        if (string.charAt(i) != '0') {
                            break;
                        }
                        i++;
                    }
                }
            }
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            A = C1795Pt1.a(th);
        }
        C1717Ot1.a aVar3 = C1717Ot1.e;
        return (String) (A instanceof C1717Ot1.b ? 0 : A);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ZT1
    @Nullable
    public final Serializable d(@NotNull JM jm) {
        C2727aU1 c2727aU1;
        Serializable serializableA;
        if (jm instanceof C2727aU1) {
            c2727aU1 = (C2727aU1) jm;
            int i = c2727aU1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2727aU1.g = i - Integer.MIN_VALUE;
            } else {
                c2727aU1 = new C2727aU1(this, jm);
            }
        } else {
            c2727aU1 = new C2727aU1(this, jm);
        }
        Object objF = c2727aU1.d;
        MN mn = MN.d;
        int i2 = c2727aU1.g;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objF);
                C1717Ot1.a aVar = C1717Ot1.e;
                Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.a).getAppSetIdInfo();
                Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "getAppSetIdInfo(...)");
                c2727aU1.g = 1;
                objF = C0957Fb.f(appSetIdInfo, c2727aU1);
                if (objF == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objF);
            }
            serializableA = ((AppSetIdInfo) objF).getId();
            C1717Ot1.a aVar2 = C1717Ot1.e;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            serializableA = C1795Pt1.a(th);
        }
        if (serializableA instanceof C1717Ot1.b) {
            return null;
        }
        return serializableA;
    }

    public final String e() throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.a);
        return (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
    }
}
