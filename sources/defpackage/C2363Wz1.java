package defpackage;

import com.pexpress.tool.R;
import io.sentry.android.core.b0;
import kotlin.Unit;

/* JADX INFO: renamed from: Wz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2363Wz1<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C4617jA1 d;
    public final /* synthetic */ C2512Yo1 e;

    /* JADX INFO: renamed from: Wz1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$listenForTrading$2", f = "RobotTrading.kt", l = {378, 382, 383, 384}, m = "emit")
    public static final class a extends LM {
        public C2363Wz1 d;
        public C4617jA1 e;
        public String g;
        public C2512Yo1 h;
        public /* synthetic */ Object i;
        public final /* synthetic */ C2363Wz1<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C2363Wz1<? super T> c2363Wz1, JM<? super a> jm) {
            super(jm);
            this.j = c2363Wz1;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return this.j.a(null, this);
        }
    }

    public C2363Wz1(C4617jA1 c4617jA1, C2512Yo1 c2512Yo1) {
        this.d = c4617jA1;
        this.e = c2512Yo1;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:127:0x022d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0299  */
    /* JADX WARN: Code duplicated, block: B:295:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0270 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x01c0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x022d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:150:0x0299, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x00fc, please report this as an issue */
    @Override // defpackage.InterfaceC6606sf0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(Z22 z22, JM<? super Unit> jm) {
        a aVar;
        Object objA;
        Object objA2;
        Object objA3;
        C2363Wz1<T> c2363Wz1;
        Object objA4;
        Object objA5;
        Object objA6;
        Object objA7;
        Object objA8;
        Object objA9;
        Object objA10;
        Object objA11;
        Object objA12;
        Object objA13;
        Object objA14;
        Object objA15;
        Object objA16;
        Object objA17;
        Object objA18;
        Object objA19;
        Object objA20;
        String str;
        C2363Wz1<T> c2363Wz2;
        String str2;
        C2363Wz1<T> c2363Wz3;
        String str3;
        C2363Wz1<T> c2363Wz4;
        String str4;
        C2512Yo1 c2512Yo1;
        Object objA21;
        Throwable thA;
        Object objA22;
        Throwable thA2;
        Object objA23;
        Throwable thA3;
        Object objA24;
        Throwable thA4;
        Object objA25;
        Throwable thA5;
        Object objA26;
        Throwable thA6;
        Object objA27;
        Throwable thA7;
        Object objA28;
        Throwable thA8;
        C4617jA1 c4617jA1 = this.d;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.k = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, jm);
            }
        } else {
            aVar = new a(this, jm);
        }
        Object obj = aVar.i;
        MN mn = MN.d;
        int i2 = aVar.k;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            try {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                c4617jA1.y.Z(z22);
                objA = Unit.a;
            } catch (Throwable th) {
                C1717Ot1.a aVar3 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            Throwable thA9 = C1717Ot1.a(objA);
            if (thA9 != null) {
                b0.f("RobotTrading", "telemetry tradingEventReceived failed", thA9);
            }
            z22.toString();
            boolean z = z22 instanceof U32;
            C2512Yo1 c2512Yo2 = this.e;
            if (z) {
                str4 = "TradingStarted";
                try {
                    aVar.d = this;
                    aVar.e = c4617jA1;
                    aVar.g = "TradingStarted";
                    aVar.h = c2512Yo2;
                    aVar.k = 1;
                    if (C4617jA1.g(c4617jA1, aVar) != mn) {
                        c2363Wz1 = this;
                        c2512Yo1 = c2512Yo2;
                        c2512Yo1.d = true;
                        objA21 = Unit.a;
                        C1717Ot1.a aVar4 = C1717Ot1.e;
                        thA = C1717Ot1.a(objA21);
                        if (thA != null) {
                            c4617jA1.y.Y(thA, OW0.b(LE.l("trading_event_arm_" + str4)));
                            objA22 = Unit.a;
                            thA2 = C1717Ot1.a(objA22);
                            if (thA2 != null) {
                                b0.f("RobotTrading", "telemetry trading_event_arm_" + str4 + " failed", thA2);
                            }
                        }
                        Unit unit = Unit.a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c2363Wz1 = this;
                    C1717Ot1.a aVar5 = C1717Ot1.e;
                    objA21 = C1795Pt1.a(th);
                }
            } else {
                if (z22 instanceof Va2) {
                    try {
                        c4617jA1.getClass();
                        c4617jA1.f.b(new C6962uL1(5));
                        c4617jA1.u(true);
                        c4617jA1.l(FI1.i.b);
                        objA2 = Unit.a;
                    } catch (Throwable th3) {
                        C1717Ot1.a aVar6 = C1717Ot1.e;
                        objA2 = C1795Pt1.a(th3);
                    }
                    Throwable thA10 = C1717Ot1.a(objA2);
                    if (thA10 != null) {
                        try {
                            c4617jA1.y.Y(thA10, OW0.b(LE.l("trading_event_arm_UserCancelledBet")));
                            objA3 = Unit.a;
                        } catch (Throwable th4) {
                            C1717Ot1.a aVar7 = C1717Ot1.e;
                            objA3 = C1795Pt1.a(th4);
                        }
                        Throwable thA11 = C1717Ot1.a(objA3);
                        if (thA11 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_UserCancelledBet failed", thA11);
                        }
                    }
                    Unit unit2 = Unit.a;
                } else if (z22 instanceof TX0) {
                    try {
                        aVar.d = this;
                        aVar.e = c4617jA1;
                        aVar.g = "MaxProfitEarned";
                        aVar.k = 2;
                        if (C4617jA1.f(c4617jA1, (TX0) z22, aVar) != mn) {
                            str3 = "MaxProfitEarned";
                            c2363Wz4 = this;
                            objA23 = Unit.a;
                            C1717Ot1.a aVar8 = C1717Ot1.e;
                            c2363Wz1 = c2363Wz4;
                            thA3 = C1717Ot1.a(objA23);
                            if (thA3 != null) {
                                c4617jA1.y.Y(thA3, OW0.b(LE.l("trading_event_arm_" + str3)));
                                objA24 = Unit.a;
                                thA4 = C1717Ot1.a(objA24);
                                if (thA4 != null) {
                                    b0.f("RobotTrading", "telemetry trading_event_arm_" + str3 + " failed", thA4);
                                }
                            }
                            Unit unit3 = Unit.a;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = "MaxProfitEarned";
                        c2363Wz4 = this;
                        C1717Ot1.a aVar9 = C1717Ot1.e;
                        objA23 = C1795Pt1.a(th);
                    }
                } else if (z22 instanceof NT0) {
                    str2 = "LossLimitStop";
                    try {
                        aVar.d = this;
                        aVar.e = c4617jA1;
                        aVar.g = "LossLimitStop";
                        aVar.k = 3;
                        if (C4617jA1.e(c4617jA1, aVar) != mn) {
                            c2363Wz3 = this;
                            objA25 = Unit.a;
                            C1717Ot1.a aVar10 = C1717Ot1.e;
                            c2363Wz1 = c2363Wz3;
                            thA5 = C1717Ot1.a(objA25);
                            if (thA5 != null) {
                                c4617jA1.y.Y(thA5, OW0.b(LE.l("trading_event_arm_" + str2)));
                                objA26 = Unit.a;
                                thA6 = C1717Ot1.a(objA26);
                                if (thA6 != null) {
                                    b0.f("RobotTrading", "telemetry trading_event_arm_" + str2 + " failed", thA6);
                                }
                            }
                            Unit unit4 = Unit.a;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        c2363Wz3 = this;
                        C1717Ot1.a aVar11 = C1717Ot1.e;
                        objA25 = C1795Pt1.a(th);
                    }
                } else if (z22 instanceof C6931uB0) {
                    str = "InsufficientFunds";
                    try {
                        aVar.d = this;
                        aVar.e = c4617jA1;
                        aVar.g = "InsufficientFunds";
                        aVar.k = 4;
                        if (C4617jA1.d(c4617jA1, aVar) != mn) {
                            c2363Wz2 = this;
                            objA27 = Unit.a;
                            C1717Ot1.a aVar12 = C1717Ot1.e;
                            c2363Wz1 = c2363Wz2;
                            thA7 = C1717Ot1.a(objA27);
                            if (thA7 != null) {
                                c4617jA1.y.Y(thA7, OW0.b(LE.l("trading_event_arm_" + str)));
                                objA28 = Unit.a;
                                thA8 = C1717Ot1.a(objA28);
                                if (thA8 != null) {
                                    b0.f("RobotTrading", "telemetry trading_event_arm_" + str + " failed", thA8);
                                }
                            }
                            Unit unit5 = Unit.a;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        c2363Wz2 = this;
                        C1717Ot1.a aVar13 = C1717Ot1.e;
                        objA27 = C1795Pt1.a(th);
                    }
                } else if (z22 instanceof Y32) {
                    try {
                        c4617jA1.getClass();
                        c4617jA1.f.b(new C7803yL1(new C6693t4(c4617jA1, 4)));
                        c4617jA1.u(true);
                        c4617jA1.l(FI1.j.b);
                        objA4 = Unit.a;
                    } catch (Throwable th8) {
                        C1717Ot1.a aVar14 = C1717Ot1.e;
                        objA4 = C1795Pt1.a(th8);
                    }
                    Throwable thA12 = C1717Ot1.a(objA4);
                    if (thA12 != null) {
                        try {
                            c4617jA1.y.Y(thA12, OW0.b(LE.l("trading_event_arm_TradingStoppedVerification")));
                            objA5 = Unit.a;
                        } catch (Throwable th9) {
                            C1717Ot1.a aVar15 = C1717Ot1.e;
                            objA5 = C1795Pt1.a(th9);
                        }
                        Throwable thA13 = C1717Ot1.a(objA5);
                        if (thA13 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_TradingStoppedVerification failed", thA13);
                        }
                    }
                    Unit unit6 = Unit.a;
                } else if (z22 instanceof C3912g32) {
                    try {
                        c4617jA1.getClass();
                        c4617jA1.f.b(new C5493nL1(null));
                        c4617jA1.u(true);
                        c4617jA1.l(FI1.b.b);
                        objA6 = Unit.a;
                    } catch (Throwable th10) {
                        C1717Ot1.a aVar16 = C1717Ot1.e;
                        objA6 = C1795Pt1.a(th10);
                    }
                    Throwable thA14 = C1717Ot1.a(objA6);
                    if (thA14 != null) {
                        try {
                            c4617jA1.y.Y(thA14, OW0.b(LE.l("trading_event_arm_TradingLimitOpenTrades")));
                            objA7 = Unit.a;
                        } catch (Throwable th11) {
                            C1717Ot1.a aVar17 = C1717Ot1.e;
                            objA7 = C1795Pt1.a(th11);
                        }
                        Throwable thA15 = C1717Ot1.a(objA7);
                        if (thA15 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_TradingLimitOpenTrades failed", thA15);
                        }
                    }
                    Unit unit7 = Unit.a;
                } else if (z22 instanceof C4332i32) {
                    try {
                        c4617jA1.s(c2512Yo2.d, ((C4332i32) z22).a, Integer.valueOf(R.string.profit_limit_popup_text));
                        c4617jA1.u(true);
                        c4617jA1.l(FI1.e.b);
                        objA8 = Unit.a;
                    } catch (Throwable th12) {
                        C1717Ot1.a aVar18 = C1717Ot1.e;
                        objA8 = C1795Pt1.a(th12);
                    }
                    Throwable thA16 = C1717Ot1.a(objA8);
                    if (thA16 != null) {
                        try {
                            c4617jA1.y.Y(thA16, OW0.b(LE.l("trading_event_arm_TradingMaxDemoTrades")));
                            objA9 = Unit.a;
                        } catch (Throwable th13) {
                            C1717Ot1.a aVar19 = C1717Ot1.e;
                            objA9 = C1795Pt1.a(th13);
                        }
                        Throwable thA17 = C1717Ot1.a(objA9);
                        if (thA17 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_TradingMaxDemoTrades failed", thA17);
                        }
                    }
                    Unit unit8 = Unit.a;
                } else if (z22 instanceof W32) {
                    try {
                        c4617jA1.getClass();
                        c4617jA1.f.b(new C3133cL1(null));
                        c4617jA1.u(true);
                        c4617jA1.l(FI1.g.b);
                        objA10 = Unit.a;
                    } catch (Throwable th14) {
                        C1717Ot1.a aVar20 = C1717Ot1.e;
                        objA10 = C1795Pt1.a(th14);
                    }
                    Throwable thA18 = C1717Ot1.a(objA10);
                    if (thA18 != null) {
                        try {
                            c4617jA1.y.Y(thA18, OW0.b(LE.l("trading_event_arm_TradingStoppedNetwork")));
                            objA11 = Unit.a;
                        } catch (Throwable th15) {
                            C1717Ot1.a aVar21 = C1717Ot1.e;
                            objA11 = C1795Pt1.a(th15);
                        }
                        Throwable thA19 = C1717Ot1.a(objA11);
                        if (thA19 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_TradingStoppedNetwork failed", thA19);
                        }
                    }
                    Unit unit9 = Unit.a;
                } else if (z22 instanceof X32) {
                    try {
                        boolean z2 = c2512Yo2.d;
                        X32 x32 = (X32) z22;
                        String str5 = x32.a;
                        c4617jA1.getClass();
                        c4617jA1.s(z2, str5, null);
                        c4617jA1.u(true);
                        c4617jA1.l(new FI1.h(str5, x32.b, x32.c, x32.d));
                        objA12 = Unit.a;
                    } catch (Throwable th16) {
                        C1717Ot1.a aVar22 = C1717Ot1.e;
                        objA12 = C1795Pt1.a(th16);
                    }
                    Throwable thA20 = C1717Ot1.a(objA12);
                    if (thA20 != null) {
                        try {
                            c4617jA1.y.Y(thA20, OW0.b(LE.l("trading_event_arm_TradingStoppedUnexpectedly")));
                            objA13 = Unit.a;
                        } catch (Throwable th17) {
                            C1717Ot1.a aVar23 = C1717Ot1.e;
                            objA13 = C1795Pt1.a(th17);
                        }
                        Throwable thA21 = C1717Ot1.a(objA13);
                        if (thA21 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_TradingStoppedUnexpectedly failed", thA21);
                        }
                    }
                    Unit unit10 = Unit.a;
                } else if (z22.equals(C2021Sr.a)) {
                    try {
                        XF0 xf0 = c4617jA1.R;
                        if (xf0 != null) {
                            xf0.l(null);
                        }
                        objA14 = Unit.a;
                    } catch (Throwable th18) {
                        C1717Ot1.a aVar24 = C1717Ot1.e;
                        objA14 = C1795Pt1.a(th18);
                    }
                    Throwable thA22 = C1717Ot1.a(objA14);
                    if (thA22 != null) {
                        try {
                            c4617jA1.y.Y(thA22, OW0.b(LE.l("trading_event_arm_BetEnded")));
                            objA15 = Unit.a;
                        } catch (Throwable th19) {
                            C1717Ot1.a aVar25 = C1717Ot1.e;
                            objA15 = C1795Pt1.a(th19);
                        }
                        Throwable thA23 = C1717Ot1.a(objA15);
                        if (thA23 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_BetEnded failed", thA23);
                        }
                    }
                    Unit unit11 = Unit.a;
                } else if (z22.equals(C7151vE1.a)) {
                    try {
                        Boolean bool = Boolean.TRUE;
                        GP1 gp1 = c4617jA1.I;
                        gp1.getClass();
                        gp1.m(null, bool);
                        c4617jA1.r();
                        objA16 = Unit.a;
                    } catch (Throwable th20) {
                        C1717Ot1.a aVar26 = C1717Ot1.e;
                        objA16 = C1795Pt1.a(th20);
                    }
                    Throwable thA24 = C1717Ot1.a(objA16);
                    if (thA24 != null) {
                        try {
                            c4617jA1.y.Y(thA24, OW0.b(LE.l("trading_event_arm_SearchSignals")));
                            objA17 = Unit.a;
                        } catch (Throwable th21) {
                            C1717Ot1.a aVar27 = C1717Ot1.e;
                            objA17 = C1795Pt1.a(th21);
                        }
                        Throwable thA25 = C1717Ot1.a(objA17);
                        if (thA25 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_SearchSignals failed", thA25);
                        }
                    }
                    Unit unit12 = Unit.a;
                } else if (z22.equals(C0693Br.a)) {
                    try {
                        c4617jA1.getClass();
                        objA18 = Unit.a;
                    } catch (Throwable th22) {
                        C1717Ot1.a aVar28 = C1717Ot1.e;
                        objA18 = C1795Pt1.a(th22);
                    }
                    Throwable thA26 = C1717Ot1.a(objA18);
                    if (thA26 != null) {
                        try {
                            c4617jA1.y.Y(thA26, OW0.b(LE.l("trading_event_arm_BetClosed")));
                            objA19 = Unit.a;
                        } catch (Throwable th23) {
                            C1717Ot1.a aVar29 = C1717Ot1.e;
                            objA19 = C1795Pt1.a(th23);
                        }
                        Throwable thA27 = C1717Ot1.a(objA19);
                        if (thA27 != null) {
                            b0.f("RobotTrading", "telemetry trading_event_arm_BetClosed failed", thA27);
                        }
                    }
                    Unit unit13 = Unit.a;
                } else {
                    try {
                        c4617jA1.y.Y(new IllegalStateException("unhandled trading event " + C2017Sp1.a.b(z22.getClass()).f()), OW0.b(LE.l("trading_event_unhandled")));
                        objA20 = Unit.a;
                    } catch (Throwable th24) {
                        C1717Ot1.a aVar30 = C1717Ot1.e;
                        objA20 = C1795Pt1.a(th24);
                    }
                    Throwable thA28 = C1717Ot1.a(objA20);
                    if (thA28 != null) {
                        b0.f("RobotTrading", "telemetry trading_event_unhandled failed", thA28);
                    }
                }
                c2363Wz1 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c2512Yo1 = aVar.h;
            str4 = aVar.g;
            c4617jA1 = aVar.e;
            c2363Wz1 = aVar.d;
            try {
                C1795Pt1.b(obj);
                c2512Yo1.d = true;
                objA21 = Unit.a;
                C1717Ot1.a aVar31 = C1717Ot1.e;
            } catch (Throwable th25) {
                th = th25;
                C1717Ot1.a aVar32 = C1717Ot1.e;
                objA21 = C1795Pt1.a(th);
            }
            thA = C1717Ot1.a(objA21);
            if (thA != null) {
                try {
                    c4617jA1.y.Y(thA, OW0.b(LE.l("trading_event_arm_" + str4)));
                    objA22 = Unit.a;
                } catch (Throwable th26) {
                    C1717Ot1.a aVar33 = C1717Ot1.e;
                    objA22 = C1795Pt1.a(th26);
                }
                thA2 = C1717Ot1.a(objA22);
                if (thA2 != null) {
                    b0.f("RobotTrading", "telemetry trading_event_arm_" + str4 + " failed", thA2);
                }
            }
            Unit unit14 = Unit.a;
        } else if (i2 == 2) {
            str3 = aVar.g;
            c4617jA1 = aVar.e;
            c2363Wz4 = aVar.d;
            try {
                C1795Pt1.b(obj);
                objA23 = Unit.a;
                C1717Ot1.a aVar34 = C1717Ot1.e;
            } catch (Throwable th27) {
                th = th27;
                C1717Ot1.a aVar35 = C1717Ot1.e;
                objA23 = C1795Pt1.a(th);
            }
            c2363Wz1 = c2363Wz4;
            thA3 = C1717Ot1.a(objA23);
            if (thA3 != null) {
                try {
                    c4617jA1.y.Y(thA3, OW0.b(LE.l("trading_event_arm_" + str3)));
                    objA24 = Unit.a;
                } catch (Throwable th28) {
                    C1717Ot1.a aVar36 = C1717Ot1.e;
                    objA24 = C1795Pt1.a(th28);
                }
                thA4 = C1717Ot1.a(objA24);
                if (thA4 != null) {
                    b0.f("RobotTrading", "telemetry trading_event_arm_" + str3 + " failed", thA4);
                }
            }
            Unit unit15 = Unit.a;
        } else if (i2 == 3) {
            str2 = aVar.g;
            c4617jA1 = aVar.e;
            c2363Wz3 = aVar.d;
            try {
                C1795Pt1.b(obj);
                objA25 = Unit.a;
                C1717Ot1.a aVar110 = C1717Ot1.e;
            } catch (Throwable th29) {
                th = th29;
                C1717Ot1.a aVar111 = C1717Ot1.e;
                objA25 = C1795Pt1.a(th);
            }
            c2363Wz1 = c2363Wz3;
            thA5 = C1717Ot1.a(objA25);
            if (thA5 != null) {
                try {
                    c4617jA1.y.Y(thA5, OW0.b(LE.l("trading_event_arm_" + str2)));
                    objA26 = Unit.a;
                } catch (Throwable th30) {
                    C1717Ot1.a aVar37 = C1717Ot1.e;
                    objA26 = C1795Pt1.a(th30);
                }
                thA6 = C1717Ot1.a(objA26);
                if (thA6 != null) {
                    b0.f("RobotTrading", "telemetry trading_event_arm_" + str2 + " failed", thA6);
                }
            }
            Unit unit16 = Unit.a;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = aVar.g;
            c4617jA1 = aVar.e;
            c2363Wz2 = aVar.d;
            try {
                C1795Pt1.b(obj);
                objA27 = Unit.a;
                C1717Ot1.a aVar112 = C1717Ot1.e;
            } catch (Throwable th31) {
                th = th31;
                C1717Ot1.a aVar113 = C1717Ot1.e;
                objA27 = C1795Pt1.a(th);
            }
            c2363Wz1 = c2363Wz2;
            thA7 = C1717Ot1.a(objA27);
            if (thA7 != null) {
                try {
                    c4617jA1.y.Y(thA7, OW0.b(LE.l("trading_event_arm_" + str)));
                    objA28 = Unit.a;
                } catch (Throwable th32) {
                    C1717Ot1.a aVar38 = C1717Ot1.e;
                    objA28 = C1795Pt1.a(th32);
                }
                thA8 = C1717Ot1.a(objA28);
                if (thA8 != null) {
                    b0.f("RobotTrading", "telemetry trading_event_arm_" + str + " failed", thA8);
                }
            }
            Unit unit17 = Unit.a;
        }
        GP1 gp2 = c2363Wz1.d.E;
        Boolean bool2 = Boolean.FALSE;
        gp2.getClass();
        gp2.m(null, bool2);
        return Unit.a;
    }
}
