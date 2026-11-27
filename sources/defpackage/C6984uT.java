package defpackage;

import com.google.android.gms.common.api.Api;
import j$.time.DateTimeException;
import j$.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6984uT {

    @NotNull
    public static final a b;
    public static final /* synthetic */ IJ0<Object>[] c;

    @NotNull
    public final HT a;

    /* JADX INFO: renamed from: uT$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: uT$b */
    public static final class b {

        @NotNull
        public static final IT a;

        /* JADX INFO: renamed from: uT$b$a */
        public static final class a extends ML0 implements Function1<LT.b, Unit> {
            public static final a d = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(LT.b bVar) {
                LT.b Format = bVar;
                Intrinsics.checkNotNullParameter(Format, "$this$Format");
                Format.n((KT) C7820yR0.a.getValue());
                MT.a(Format, new Function1[]{C7194vT.d}, C7405wT.d);
                LT.c.a.a(Format);
                MT.b(Format, ':');
                LT.c.a.b(Format);
                MT.b(Format, ':');
                LT.c.a.c(Format);
                MT.c(Format, "", C7615xT.d);
                MT.a(Format, new Function1[]{C7825yT.d}, C8035zT.d);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: uT$b$b, reason: collision with other inner class name */
        public static final class C0503b extends ML0 implements Function1<LT.b, Unit> {
            public static final C0503b d = new C0503b(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(LT.b bVar) {
                LT.b Format = bVar;
                Intrinsics.checkNotNullParameter(Format, "$this$Format");
                MT.a(Format, new Function1[]{AT.d}, BT.d);
                Format.k(EnumC6172qb1.d);
                MT.b(Format, ' ');
                Format.c(C3693f11.b);
                MT.b(Format, ' ');
                LT.a.C0084a.a(Format);
                MT.b(Format, ' ');
                LT.c.a.a(Format);
                MT.b(Format, ':');
                LT.c.a.b(Format);
                MT.c(Format, "", CT.d);
                Format.d(" ");
                MT.a(Format, new Function1[]{DT.d, ET.d}, GT.d);
                return Unit.a;
            }
        }

        static {
            C6984uT.b.getClass();
            a block = a.d;
            Intrinsics.checkNotNullParameter(block, "block");
            IT.a aVar = new IT.a(new C7458wi());
            block.invoke(aVar);
            a = new IT(InterfaceC3058c0.a.c(aVar));
            C0503b block2 = C0503b.d;
            Intrinsics.checkNotNullParameter(block2, "block");
            IT.a aVar2 = new IT.a(new C7458wi());
            block2.invoke(aVar2);
            new IT(InterfaceC3058c0.a.c(aVar2));
        }
    }

    /* JADX INFO: renamed from: uT$c */
    public /* synthetic */ class c extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C7929yx0) this.e).c;
        }
    }

    /* JADX INFO: renamed from: uT$d */
    public /* synthetic */ class d extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C8139zx0) this.e).a;
        }
    }

    /* JADX INFO: renamed from: uT$e */
    public /* synthetic */ class e extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C8139zx0) this.e).b;
        }
    }

    /* JADX INFO: renamed from: uT$f */
    public /* synthetic */ class f extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C8139zx0) this.e).d;
        }
    }

    /* JADX INFO: renamed from: uT$g */
    public /* synthetic */ class g extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C7929yx0) this.e).b;
        }
    }

    /* JADX INFO: renamed from: uT$h */
    public /* synthetic */ class h extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C0712Bx0) this.e).b;
        }
    }

    /* JADX INFO: renamed from: uT$i */
    public /* synthetic */ class i extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C0712Bx0) this.e).c;
        }
    }

    /* JADX INFO: renamed from: uT$j */
    public /* synthetic */ class j extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C0712Bx0) this.e).d;
        }
    }

    /* JADX INFO: renamed from: uT$k */
    public /* synthetic */ class k extends C2635a21 {
        @Override // defpackage.JJ0
        @Nullable
        public final Object get() {
            return ((C8139zx0) this.e).e;
        }
    }

    static {
        C3068c21 c3068c21 = new C3068c21(C6984uT.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;");
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        c = new IJ0[]{c2251Vp1.e(c3068c21), C0681Bn.b(C6984uT.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", c2251Vp1), C0681Bn.b(C6984uT.class, "hour", "getHour()Ljava/lang/Integer;", c2251Vp1), C0681Bn.b(C6984uT.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", c2251Vp1), C0681Bn.b(C6984uT.class, "minute", "getMinute()Ljava/lang/Integer;", c2251Vp1), C0681Bn.b(C6984uT.class, "second", "getSecond()Ljava/lang/Integer;", c2251Vp1), C0681Bn.b(C6984uT.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", c2251Vp1), C0681Bn.b(C6984uT.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", c2251Vp1), C0681Bn.b(C6984uT.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", c2251Vp1)};
        b = new a();
    }

    public C6984uT() {
        this(new HT(0));
    }

    @NotNull
    public final VA0 a() throws Exception {
        int i2;
        HT ht = this.a;
        Rb2 rb2B = ht.c.b();
        C8139zx0 c8139zx0 = ht.b;
        FR0 fr0D = c8139zx0.d();
        C7929yx0 c7929yx0 = ht.a;
        Integer num = c7929yx0.a;
        C7929yx0 c7929yx1 = new C7929yx0(num, c7929yx0.b, c7929yx0.c, c7929yx0.d);
        C7820yR0.a(num, "year");
        c7929yx1.a = Integer.valueOf(num.intValue() % 10000);
        try {
            Integer num2 = c7929yx0.a;
            Intrinsics.checkNotNull(num2);
            long jMultiplyExact = Math.multiplyExact(num2.intValue() / 10000, 315569520000L);
            long epochDay = c7929yx1.b().d.toEpochDay();
            if (epochDay > 2147483647L) {
                i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            } else {
                i2 = epochDay < -2147483648L ? Integer.MIN_VALUE : (int) epochDay;
            }
            long jAddExact = Math.addExact(jMultiplyExact, ((((long) i2) * ((long) 86400)) + ((long) fr0D.d.toSecondOfDay())) - ((long) rb2B.a.getTotalSeconds()));
            VA0.Companion.getClass();
            if (jAddExact < VA0.e.d.getEpochSecond() || jAddExact > VA0.g.d.getEpochSecond()) {
                Intrinsics.checkNotNullParameter("The parsed date is outside the range representable by Instant", "message");
                throw new NT("The parsed date is outside the range representable by Instant");
            }
            Integer num3 = c8139zx0.f;
            try {
                Instant instantOfEpochSecond = Instant.ofEpochSecond(jAddExact, num3 != null ? num3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                return new VA0(instantOfEpochSecond);
            } catch (Exception e2) {
                if ((e2 instanceof ArithmeticException) || (e2 instanceof DateTimeException)) {
                    return jAddExact > 0 ? VA0.g : VA0.e;
                }
                throw e2;
            }
        } catch (ArithmeticException e3) {
            throw new NT("The parsed date is outside the range representable by Instant", e3);
        }
    }

    public C6984uT(@NotNull HT contents) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        this.a = contents;
        contents.getClass();
        g reference = new g(contents.a, C7929yx0.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference, "reference");
        c reference2 = new c(contents.a, C7929yx0.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference2, "reference");
        d reference3 = new d(contents.b, C8139zx0.class, "hour", "getHour()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference3, "reference");
        e reference4 = new e(contents.b, C8139zx0.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference4, "reference");
        contents.getClass();
        f reference5 = new f(contents.b, C8139zx0.class, "minute", "getMinute()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference5, "reference");
        k reference6 = new k(contents.b, C8139zx0.class, "second", "getSecond()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference6, "reference");
        contents.getClass();
        h reference7 = new h(contents.c, C0712Bx0.class, "totalHoursAbs", "getTotalHoursAbs()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference7, "reference");
        i reference8 = new i(contents.c, C0712Bx0.class, "minutesOfHour", "getMinutesOfHour()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference8, "reference");
        j reference9 = new j(contents.c, C0712Bx0.class, "secondsOfMinute", "getSecondsOfMinute()Ljava/lang/Integer;", 0);
        Intrinsics.checkNotNullParameter(reference9, "reference");
    }
}
