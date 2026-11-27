package defpackage;

import com.api.feature.telemetry.exceptions.RobotTelemetryException;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4245hf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC1777Pn1 b;

    @NotNull
    public final InterfaceC3706f42 c;

    @NotNull
    public final O3 d;

    @NotNull
    public final AtomicBoolean e;

    @NotNull
    public final C7666xh1 f;

    @NotNull
    public final C6295r91 g;

    /* JADX INFO: renamed from: hf$a */
    @InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$start$1$1", f = "AppDataReadinessProbe.kt", l = {142}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: hf$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$start$1$1$1", f = "AppDataReadinessProbe.kt", l = {}, m = "invokeSuspend")
        public static final class C0366a extends AW1 implements Function2<EnumC3495e41, JM<? super Boolean>, Object> {
            public /* synthetic */ Object d;

            public C0366a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0366a c0366a = new C0366a(2, jm);
                c0366a.d = obj;
                return c0366a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EnumC3495e41 enumC3495e41, JM<? super Boolean> jm) {
                return ((C0366a) create(enumC3495e41, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                EnumC3495e41 enumC3495e41 = (EnumC3495e41) this.d;
                return Boolean.valueOf((enumC3495e41 == null || C7652xe.g(enumC3495e41)) ? false : true);
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4245hf.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C4245hf c4245hf = C4245hf.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = c4245hf.a.r;
                C0366a c0366a = new C0366a(2, null);
                this.d = 1;
                if (C4466ii.p(gp1, c0366a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            c4245hf.e.set(true);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: hf$b */
    @InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$start$1$2", f = "AppDataReadinessProbe.kt", l = {146}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;

        /* JADX INFO: renamed from: hf$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4245hf d;
            public final /* synthetic */ KN e;

            public a(C4245hf c4245hf, KN kn) {
                this.d = c4245hf;
                this.e = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zA;
                C4245hf c4245hf = this.d;
                C7666xh1 c7666xh1 = c4245hf.f;
                C6315rG c6315rG = (C6315rG) c4245hf.a.f.getValue();
                String str = c6315rG != null ? c6315rG.a : null;
                synchronized (c7666xh1) {
                    zA = c7666xh1.b.a(str);
                    if (!c7666xh1.a) {
                        zA = true;
                        c7666xh1.a = true;
                    }
                }
                if (zA) {
                    C5189lv.k(this.e, null, new Cif(this.d, null), 3);
                }
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            b bVar = C4245hf.this.new b(jm);
            bVar.e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((b) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw EK.c(obj);
            }
            C1795Pt1.b(obj);
            KN kn = (KN) this.e;
            C4245hf c4245hf = C4245hf.this;
            C6120qK1 c6120qK1B = c4245hf.b.b();
            a aVar = new a(c4245hf, kn);
            this.d = 1;
            c6120qK1B.c(aVar, this);
            return mn;
        }
    }

    public C4245hf(@NotNull C4923kf appData, @NotNull InterfaceC1777Pn1 readyUseCase, @NotNull InterfaceC3706f42 reporter, @NotNull O3 accountModeSelection) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(readyUseCase, "readyUseCase");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(accountModeSelection, "accountModeSelection");
        this.a = appData;
        this.b = readyUseCase;
        this.c = reporter;
        this.d = accountModeSelection;
        this.e = new AtomicBoolean(false);
        this.f = new C7666xh1();
        this.g = new C6295r91();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b9 A[Catch: all -> 0x02bf, TRY_LEAVE, TryCatch #6 {all -> 0x02bf, blocks: (B:107:0x02b5, B:109:0x02b9), top: B:133:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:123:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0143  */
    /* JADX WARN: Code duplicated, block: B:50:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0207 A[Catch: all -> 0x020f, TRY_LEAVE, TryCatch #7 {all -> 0x020f, blocks: (B:82:0x0203, B:84:0x0207), top: B:135:0x0203 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x024a  */
    /* JADX WARN: Code duplicated, block: B:98:0x028f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0297  */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x02e4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x01b0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x024a, please report this as an issue */
    public static final Object a(C4245hf c4245hf, InterfaceC4302hv0 interfaceC4302hv0, C5647o42 c5647o42, String str, Function1 function1, LM lm) {
        C1982Se c1982Se;
        Object objA;
        C5647o42 c5647o43;
        long j;
        C4245hf c4245hf2;
        InterfaceC2347Wu0 interfaceC2347Wu0;
        MN mn;
        long j2;
        String str2;
        Function1 function2;
        int i;
        InterfaceC2347Wu0 interfaceC2347Wu1;
        int i2;
        int i3;
        int i4;
        EnumC3495e41 enumC3495e41;
        boolean z;
        Object objA2;
        Throwable thA;
        String str3;
        long j3;
        Object objA3;
        Throwable thA2;
        long j4;
        int i5;
        long j5;
        String str4;
        C5647o42 c5647o44;
        C4245hf c4245hf3;
        int i6;
        long jCurrentTimeMillis;
        EnumC4869kO1 enumC4869kO1;
        String str5;
        Object objA4;
        Throwable thA3;
        String str6 = str;
        Function1 function3 = function1;
        c4245hf.getClass();
        if (lm instanceof C1982Se) {
            c1982Se = (C1982Se) lm;
            int i7 = c1982Se.o;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1982Se.o = i7 - Integer.MIN_VALUE;
            } else {
                c1982Se = new C1982Se(c4245hf, lm);
            }
        } else {
            c1982Se = new C1982Se(c4245hf, lm);
        }
        Object objC = c1982Se.m;
        MN mn2 = MN.d;
        int i8 = c1982Se.o;
        try {
            if (i8 == 0) {
                C1795Pt1.b(objC);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                try {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    objA = interfaceC4302hv0.y("data.field_load", str6);
                } catch (Throwable th) {
                    C1717Ot1.a aVar2 = C1717Ot1.e;
                    objA = C1795Pt1.a(th);
                }
                if (objA instanceof C1717Ot1.b) {
                    objA = null;
                }
                InterfaceC2347Wu0 interfaceC2347Wu2 = (InterfaceC2347Wu0) objA;
                C2060Te c2060Te = new C2060Te(function3, null);
                c1982Se.d = c4245hf;
                c5647o43 = c5647o42;
                c1982Se.e = c5647o43;
                c1982Se.g = str6;
                c1982Se.h = function3;
                c1982Se.i = interfaceC2347Wu2;
                c1982Se.j = jCurrentTimeMillis2;
                c1982Se.o = 1;
                Object objC2 = OZ1.c(8000L, c2060Te, c1982Se);
                if (objC2 == mn2) {
                    mn = mn2;
                } else {
                    j = jCurrentTimeMillis2;
                    c4245hf2 = c4245hf;
                    interfaceC2347Wu0 = interfaceC2347Wu2;
                    objC = objC2;
                }
                return mn;
            }
            if (i8 == 1) {
                long j6 = c1982Se.j;
                InterfaceC2347Wu0 interfaceC2347Wu3 = c1982Se.i;
                Function1 function4 = (Function1) c1982Se.h;
                String str7 = c1982Se.g;
                c5647o43 = c1982Se.e;
                c4245hf2 = c1982Se.d;
                C1795Pt1.b(objC);
                j = j6;
                interfaceC2347Wu0 = interfaceC2347Wu3;
                function3 = function4;
                str6 = str7;
            } else {
                if (i8 == 2) {
                    i2 = c1982Se.l;
                    i = c1982Se.k;
                    j2 = c1982Se.j;
                    interfaceC2347Wu1 = c1982Se.i;
                    Function1 function5 = (Function1) c1982Se.h;
                    String str8 = c1982Se.g;
                    C5647o42 c5647o45 = c1982Se.e;
                    C4245hf c4245hf4 = c1982Se.d;
                    C1795Pt1.b(objC);
                    function2 = function5;
                    str2 = str8;
                    c4245hf2 = c4245hf4;
                    c5647o43 = c5647o45;
                    if (objC == null) {
                        enumC3495e41 = (EnumC3495e41) c4245hf2.a.r.getValue();
                        if (enumC3495e41 != null || C7652xe.g(enumC3495e41)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        try {
                            C1717Ot1.a aVar3 = C1717Ot1.e;
                            c4245hf2.c.o(str2);
                            objA2 = Unit.a;
                        } catch (Throwable th2) {
                            C1717Ot1.a aVar4 = C1717Ot1.e;
                            objA2 = C1795Pt1.a(th2);
                        }
                        thA = C1717Ot1.a(objA2);
                        if (thA != null) {
                            b0.f("AppDataReadinessProbe", "reporter.appDataFieldStillMissing failed", thA);
                        }
                        if (z) {
                            str3 = "still_missing";
                        } else {
                            str3 = "pending_ws_down";
                        }
                        if (c4245hf2.g.a(C2629a1.b(str3, "/", str2))) {
                            try {
                                mn = mn2;
                                j3 = j2;
                                try {
                                    objA3 = QF1.a(new RobotTelemetryException.AppDataFieldStillMissing(str2, 30000L), new C1670Oe(c4245hf2, enumC3495e41, str2, z));
                                } catch (Throwable th3) {
                                    th = th3;
                                    C1717Ot1.a aVar5 = C1717Ot1.e;
                                    objA3 = C1795Pt1.a(th);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                mn = mn2;
                                j3 = j2;
                            }
                            thA2 = C1717Ot1.a(objA3);
                            if (thA2 != null) {
                                b0.f("AppDataReadinessProbe", "Sentry capture failed for " + str2, thA2);
                            }
                        } else {
                            mn = mn2;
                            j3 = j2;
                        }
                        C2216Ve c2216Ve = new C2216Ve(function2, null);
                        c1982Se.d = c4245hf2;
                        c1982Se.e = c5647o43;
                        c1982Se.g = str2;
                        c1982Se.h = interfaceC2347Wu1;
                        c1982Se.i = null;
                        j4 = j3;
                        c1982Se.j = j4;
                        c1982Se.k = i;
                        c1982Se.l = 1;
                        c1982Se.o = 3;
                        i5 = i;
                        objC = OZ1.c(270000L, c2216Ve, c1982Se);
                        if (objC != mn) {
                            C5647o42 c5647o46 = c5647o43;
                            i3 = i5;
                            j5 = j4;
                            str4 = str2;
                            c5647o44 = c5647o46;
                            c4245hf3 = c4245hf2;
                            i6 = 1;
                        }
                        return mn;
                    }
                    i4 = i2;
                    interfaceC2347Wu0 = interfaceC2347Wu1;
                    i3 = i;
                    j = j2;
                    str6 = str2;
                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                    if (i3 == 0 || i4 != 0) {
                        enumC4869kO1 = EnumC4869kO1.DEADLINE_EXCEEDED;
                    } else {
                        enumC4869kO1 = EnumC4869kO1.OK;
                    }
                    C1717Ot1.a aVar6 = C1717Ot1.e;
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.A(enumC4869kO1);
                        Unit unit = Unit.a;
                    }
                    if (i4 == 0 || i3 != 0) {
                        str5 = str6 + " loaded after " + jCurrentTimeMillis + "ms (late arrival)";
                    } else {
                        str5 = str6 + " loaded after " + jCurrentTimeMillis + "ms";
                    }
                    NG1 ng1 = NG1.INFO;
                    Map mapE = PW0.e(new Pair("field", str6), new Pair("took_ms", new Long(jCurrentTimeMillis)));
                    c4245hf2.getClass();
                    d(str5, ng1, mapE);
                    return Unit.a;
                }
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6 = c1982Se.l;
                int i9 = c1982Se.k;
                j5 = c1982Se.j;
                interfaceC2347Wu1 = (InterfaceC2347Wu0) c1982Se.h;
                str4 = c1982Se.g;
                c5647o44 = c1982Se.e;
                c4245hf3 = c1982Se.d;
                C1795Pt1.b(objC);
                i3 = i9;
            }
            if (objC == null) {
                c5647o44.a.set(true);
                long jCurrentTimeMillis3 = System.currentTimeMillis() - j5;
                try {
                    C1717Ot1.a aVar7 = C1717Ot1.e;
                    if (interfaceC2347Wu1 != null) {
                        interfaceC2347Wu1.A(EnumC4869kO1.DEADLINE_EXCEEDED);
                        Unit unit2 = Unit.a;
                    }
                } catch (Throwable th5) {
                    C1717Ot1.a aVar8 = C1717Ot1.e;
                    C1795Pt1.a(th5);
                }
                if (c4245hf3.g.a("never_arrived/" + str4)) {
                    try {
                        objA4 = QF1.a(new RobotTelemetryException.AppDataFieldStillMissing(str4, 300000L), new C1748Pe(c4245hf3, str4));
                    } catch (Throwable th6) {
                        C1717Ot1.a aVar9 = C1717Ot1.e;
                        objA4 = C1795Pt1.a(th6);
                    }
                    thA3 = C1717Ot1.a(objA4);
                    if (thA3 != null) {
                        b0.f("AppDataReadinessProbe", "Sentry capture (never-arrived) failed for " + str4, thA3);
                    }
                }
                d(Z0.c(str4, " never arrived (ceiling 300000ms)"), NG1.ERROR, PW0.e(new Pair("field", str4), new Pair("ceiling_ms", new Long(300000L)), new Pair("elapsed_ms", new Long(jCurrentTimeMillis3))));
                return Unit.a;
            }
            i4 = i6;
            interfaceC2347Wu0 = interfaceC2347Wu1;
            c4245hf2 = c4245hf3;
            j = j5;
            str6 = str4;
            jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (i3 == 0) {
                enumC4869kO1 = EnumC4869kO1.DEADLINE_EXCEEDED;
            } else {
                enumC4869kO1 = EnumC4869kO1.DEADLINE_EXCEEDED;
            }
            C1717Ot1.a aVar10 = C1717Ot1.e;
            if (interfaceC2347Wu0 != null) {
                interfaceC2347Wu0.A(enumC4869kO1);
                Unit unit3 = Unit.a;
            }
            if (i4 == 0) {
                str5 = str6 + " loaded after " + jCurrentTimeMillis + "ms (late arrival)";
            } else {
                str5 = str6 + " loaded after " + jCurrentTimeMillis + "ms (late arrival)";
            }
            NG1 ng2 = NG1.INFO;
            Map mapE2 = PW0.e(new Pair("field", str6), new Pair("took_ms", new Long(jCurrentTimeMillis)));
            c4245hf2.getClass();
            d(str5, ng2, mapE2);
            return Unit.a;
            C1717Ot1.a aVar11 = C1717Ot1.e;
            if (interfaceC2347Wu0 != null) {
                interfaceC2347Wu0.A(enumC4869kO1);
                Unit unit4 = Unit.a;
            }
        } catch (Throwable th7) {
            C1717Ot1.a aVar12 = C1717Ot1.e;
            C1795Pt1.a(th7);
        }
        if (objC == null) {
            try {
                C1717Ot1.a aVar13 = C1717Ot1.e;
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.m(Boolean.TRUE, "stuck_loading");
                }
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.o(EnumC4869kO1.DEADLINE_EXCEEDED);
                    Unit unit5 = Unit.a;
                }
            } catch (Throwable th8) {
                C1717Ot1.a aVar14 = C1717Ot1.e;
                C1795Pt1.a(th8);
            }
            String strC = Z0.c(str6, " stuck after 8000ms");
            NG1 ng3 = NG1.WARNING;
            Map mapE3 = PW0.e(new Pair("field", str6), new Pair("threshold_ms", new Long(8000L)));
            c4245hf2.getClass();
            d(strC, ng3, mapE3);
            C2138Ue c2138Ue = new C2138Ue(function3, null);
            c1982Se.d = c4245hf2;
            c1982Se.e = c5647o43;
            c1982Se.g = str6;
            c1982Se.h = function3;
            c1982Se.i = interfaceC2347Wu0;
            j2 = j;
            c1982Se.j = j2;
            c1982Se.k = 1;
            c1982Se.l = 0;
            c1982Se.o = 2;
            objC = OZ1.c(22000L, c2138Ue, c1982Se);
            if (objC == mn2) {
                mn = mn2;
            } else {
                str2 = str6;
                function2 = function3;
                i = 1;
                interfaceC2347Wu1 = interfaceC2347Wu0;
                i2 = 0;
                if (objC == null) {
                    enumC3495e41 = (EnumC3495e41) c4245hf2.a.r.getValue();
                    if (enumC3495e41 != null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    C1717Ot1.a aVar15 = C1717Ot1.e;
                    c4245hf2.c.o(str2);
                    objA2 = Unit.a;
                    thA = C1717Ot1.a(objA2);
                    if (thA != null) {
                        b0.f("AppDataReadinessProbe", "reporter.appDataFieldStillMissing failed", thA);
                    }
                    if (z) {
                        str3 = "still_missing";
                    } else {
                        str3 = "pending_ws_down";
                    }
                    if (c4245hf2.g.a(C2629a1.b(str3, "/", str2))) {
                        mn = mn2;
                        j3 = j2;
                        objA3 = QF1.a(new RobotTelemetryException.AppDataFieldStillMissing(str2, 30000L), new C1670Oe(c4245hf2, enumC3495e41, str2, z));
                        thA2 = C1717Ot1.a(objA3);
                        if (thA2 != null) {
                            b0.f("AppDataReadinessProbe", "Sentry capture failed for " + str2, thA2);
                        }
                    } else {
                        mn = mn2;
                        j3 = j2;
                    }
                    C2216Ve c2216Ve2 = new C2216Ve(function2, null);
                    c1982Se.d = c4245hf2;
                    c1982Se.e = c5647o43;
                    c1982Se.g = str2;
                    c1982Se.h = interfaceC2347Wu1;
                    c1982Se.i = null;
                    j4 = j3;
                    c1982Se.j = j4;
                    c1982Se.k = i;
                    c1982Se.l = 1;
                    c1982Se.o = 3;
                    i5 = i;
                    objC = OZ1.c(270000L, c2216Ve2, c1982Se);
                    if (objC != mn) {
                        C5647o42 c5647o47 = c5647o43;
                        i3 = i5;
                        j5 = j4;
                        str4 = str2;
                        c5647o44 = c5647o47;
                        c4245hf3 = c4245hf2;
                        i6 = 1;
                        if (objC == null) {
                            c5647o44.a.set(true);
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - j5;
                            C1717Ot1.a aVar16 = C1717Ot1.e;
                            if (interfaceC2347Wu1 != null) {
                                interfaceC2347Wu1.A(EnumC4869kO1.DEADLINE_EXCEEDED);
                                Unit unit6 = Unit.a;
                            }
                            if (c4245hf3.g.a("never_arrived/" + str4)) {
                                objA4 = QF1.a(new RobotTelemetryException.AppDataFieldStillMissing(str4, 300000L), new C1748Pe(c4245hf3, str4));
                                thA3 = C1717Ot1.a(objA4);
                                if (thA3 != null) {
                                    b0.f("AppDataReadinessProbe", "Sentry capture (never-arrived) failed for " + str4, thA3);
                                }
                            }
                            d(Z0.c(str4, " never arrived (ceiling 300000ms)"), NG1.ERROR, PW0.e(new Pair("field", str4), new Pair("ceiling_ms", new Long(300000L)), new Pair("elapsed_ms", new Long(jCurrentTimeMillis4))));
                            return Unit.a;
                        }
                        i4 = i6;
                        interfaceC2347Wu0 = interfaceC2347Wu1;
                        c4245hf2 = c4245hf3;
                        j = j5;
                        str6 = str4;
                    }
                } else {
                    i4 = i2;
                    interfaceC2347Wu0 = interfaceC2347Wu1;
                    i3 = i;
                    j = j2;
                    str6 = str2;
                }
            }
            return mn;
        }
        i3 = 0;
        i4 = 0;
        jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (i3 == 0) {
            enumC4869kO1 = EnumC4869kO1.DEADLINE_EXCEEDED;
        } else {
            enumC4869kO1 = EnumC4869kO1.DEADLINE_EXCEEDED;
        }
        if (i4 == 0) {
            str5 = str6 + " loaded after " + jCurrentTimeMillis + "ms (late arrival)";
        } else {
            str5 = str6 + " loaded after " + jCurrentTimeMillis + "ms (late arrival)";
        }
        NG1 ng4 = NG1.INFO;
        Map mapE4 = PW0.e(new Pair("field", str6), new Pair("took_ms", new Long(jCurrentTimeMillis)));
        c4245hf2.getClass();
        d(str5, ng4, mapE4);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object b(C4245hf c4245hf, LM lm) {
        C2480Ye c2480Ye;
        Object objA;
        InterfaceC4302hv0 interfaceC4302hv0;
        C5647o42 c5647o42;
        Object objA2;
        EnumC4869kO1 status;
        c4245hf.getClass();
        if (lm instanceof C2480Ye) {
            c2480Ye = (C2480Ye) lm;
            int i = c2480Ye.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2480Ye.i = i - Integer.MIN_VALUE;
            } else {
                c2480Ye = new C2480Ye(c4245hf, lm);
            }
        } else {
            c2480Ye = new C2480Ye(c4245hf, lm);
        }
        C2480Ye c2480Ye2 = c2480Ye;
        Object objC = c2480Ye2.g;
        MN mn = MN.d;
        int i2 = c2480Ye2.i;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                objA = QF1.e().o("robot.bootstrap", "loading", new C5437n42());
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            Throwable thA = C1717Ot1.a(objA);
            if (thA != null) {
                b0.f("AppDataReadinessProbe", "startTransaction failed", thA);
                return Unit.a;
            }
            InterfaceC4302hv0 interfaceC4302hv1 = (InterfaceC4302hv0) objA;
            try {
                interfaceC4302hv1.m(C6772tS0.a(c4245hf.d), "account_mode");
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                C1717Ot1.a aVar3 = C1717Ot1.e;
                C1795Pt1.a(th2);
            }
            C5647o42 c5647o43 = new C5647o42();
            EM emA = LN.a(C3784fT.a.d.t(C6266r20.a));
            ArrayList arrayList = new ArrayList();
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "config", new C2558Ze(c4245hf, null)));
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "user_profile", new C2763af(c4245hf, null)));
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "user_balances", new C2987bf(c4245hf, null)));
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "isAccountOurs", new C3196cf(c4245hf, null)));
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "activeAssets", new C3406df(c4245hf, null)));
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "currencies", new C3615ef(c4245hf, null)));
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "token", new C3825ff(c4245hf, null)));
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "listMinAndMaxBetForCurrency", new C2298We(c4245hf, null)));
            arrayList.add(c4245hf.e(emA, interfaceC4302hv1, c5647o43, "webSocketConnection", new C2402Xe(c4245hf, null)));
            try {
                C4035gf c4035gf = new C4035gf(arrayList, null);
                c2480Ye2.d = interfaceC4302hv1;
                c2480Ye2.e = c5647o43;
                c2480Ye2.i = 1;
                objC = OZ1.c(301000L, c4035gf, c2480Ye2);
                if (objC == mn) {
                    return mn;
                }
                interfaceC4302hv0 = interfaceC4302hv1;
                c5647o42 = c5647o43;
            } catch (Throwable th3) {
                th = th3;
                interfaceC4302hv0 = interfaceC4302hv1;
                c5647o42 = c5647o43;
                C1717Ot1.a aVar4 = C1717Ot1.e;
                objA2 = C1795Pt1.a(th);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5647o42 = c2480Ye2.e;
            interfaceC4302hv0 = c2480Ye2.d;
            try {
                C1795Pt1.b(objC);
            } catch (Throwable th4) {
                th = th4;
                C1717Ot1.a aVar5 = C1717Ot1.e;
                objA2 = C1795Pt1.a(th);
            }
        }
        objA2 = (Unit) objC;
        C1717Ot1.a aVar6 = C1717Ot1.e;
        Throwable thA2 = C1717Ot1.a(objA2);
        if (thA2 != null) {
            b0.f("AppDataReadinessProbe", "joinAll failed", thA2);
        }
        boolean z = (objA2 instanceof C1717Ot1.b ? null : objA2) == null;
        if (c5647o42.b.get()) {
            status = EnumC4869kO1.INTERNAL_ERROR;
        } else {
            status = (c5647o42.a.get() || z) ? EnumC4869kO1.DEADLINE_EXCEEDED : EnumC4869kO1.OK;
        }
        Intrinsics.checkNotNullParameter(interfaceC4302hv0, "<this>");
        Intrinsics.checkNotNullParameter(status, "status");
        try {
            interfaceC4302hv0.A(status);
            Unit unit2 = Unit.a;
        } catch (Throwable th5) {
            C1717Ot1.a aVar7 = C1717Ot1.e;
            C1795Pt1.a(th5);
        }
        return Unit.a;
    }

    public static void d(String str, NG1 ng1, Map map) {
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            C0702Bu c0702Bu = new C0702Bu();
            c0702Bu.k = "bootstrap";
            c0702Bu.h = str;
            c0702Bu.m = ng1;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    c0702Bu.f(value, str2);
                }
            }
            QF1.e().g(c0702Bu);
            Unit unit = Unit.a;
            C1717Ot1.a aVar2 = C1717Ot1.e;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            C1795Pt1.a(th);
        }
    }

    public final void c(InterfaceC1015Fu0 interfaceC1015Fu0, EnumC3495e41 enumC3495e41, String str) {
        String strName;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            interfaceC1015Fu0.b("data.field", str);
            C6772tS0.f(interfaceC1015Fu0, C6772tS0.a(this.d));
            boolean z = false;
            interfaceC1015Fu0.b("ws_online", String.valueOf(enumC3495e41 == EnumC3495e41.e));
            if (enumC3495e41 != null && !C7652xe.g(enumC3495e41)) {
                z = true;
            }
            interfaceC1015Fu0.b("ws_available", String.valueOf(z));
            if (enumC3495e41 == null || (strName = enumC3495e41.name()) == null) {
                strName = "null";
            }
            interfaceC1015Fu0.b("ws_state", strName);
            interfaceC1015Fu0.b("ws_ever_open", String.valueOf(this.e.get()));
            Unit unit = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            C1795Pt1.a(th);
        }
    }

    public final C2936bP1 e(EM em, InterfaceC4302hv0 interfaceC4302hv0, C5647o42 c5647o42, String str, Function1 function1) {
        return C5189lv.k(em, C6266r20.c, new C1904Re(this, interfaceC4302hv0, c5647o42, str, function1, null), 2);
    }

    public final void f() {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            EM em = C3784fT.a;
            RV rv = C6266r20.a;
            C5189lv.k(em, rv, new a(null), 2);
            objA = C5189lv.k(em, rv, new b(null), 2);
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.f("AppDataReadinessProbe", "start failed", thA);
        }
    }
}
