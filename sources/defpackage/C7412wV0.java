package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$setDefaultLocale$1", f = "MainActivity.kt", l = {266}, m = "invokeSuspend")
public final class C7412wV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Locale e;
    public final /* synthetic */ ActivityC6781tV0 g;

    /* JADX INFO: renamed from: wV0$a */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$setDefaultLocale$1$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super String>, Object> {
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, JM<? super a> jm) {
            super(1, jm);
            this.d = str;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            String str = this.d;
            Intrinsics.checkNotNull(str);
            return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7412wV0(JM jm, ActivityC6781tV0 activityC6781tV0, Locale locale) {
        super(2, jm);
        this.e = locale;
        this.g = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7412wV0(jm, this.g, this.e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7412wV0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        ActivityC6781tV0 activityC6781tV0 = this.g;
        Locale locale = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            String languageTag = locale.toLanguageTag();
            C2702aM0 c2702aM0 = activityC6781tV0.D;
            if (c2702aM0 == null) {
                Intrinsics.l("languageUseCaseApi");
                throw null;
            }
            a aVar = new a(languageTag, null);
            this.d = 1;
            if (c2702aM0.m(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        String displayLanguage = locale.getDisplayLanguage(Locale.ENGLISH);
        ReporterApi reporterApiV = activityC6781tV0.v();
        EnumC5113la enumC5113la = EnumC5113la.LANGUAGE;
        Intrinsics.checkNotNull(displayLanguage);
        reporterApiV.b(enumC5113la, displayLanguage, WE.f(EnumC5326ma.d, EnumC5326ma.e));
        return Unit.a;
    }
}
