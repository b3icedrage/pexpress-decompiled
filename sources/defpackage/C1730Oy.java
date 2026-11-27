package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1730Oy {
    public static final void a(String str, EnumC0936Eu enumC0936Eu, Map<String, ? extends Object> map) {
        C1988Sg c1988Sg = U0.O;
        if (c1988Sg != null) {
            c1988Sg.l("auth", str, enumC0936Eu, map);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140 A[Catch: CancellationException -> 0x0110, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0110, blocks: (B:59:0x010a, B:75:0x0140, B:76:0x0147, B:78:0x014e, B:86:0x015c, B:87:0x0161, B:90:0x016b, B:91:0x0170, B:93:0x018d, B:95:0x0194, B:65:0x0118, B:66:0x011b), top: B:103:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x014e A[Catch: CancellationException -> 0x0110, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0110, blocks: (B:59:0x010a, B:75:0x0140, B:76:0x0147, B:78:0x014e, B:86:0x015c, B:87:0x0161, B:90:0x016b, B:91:0x0170, B:93:0x018d, B:95:0x0194, B:65:0x0118, B:66:0x011b), top: B:103:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:82:0x0155  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c A[Catch: CancellationException -> 0x0110, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0110, blocks: (B:59:0x010a, B:75:0x0140, B:76:0x0147, B:78:0x014e, B:86:0x015c, B:87:0x0161, B:90:0x016b, B:91:0x0170, B:93:0x018d, B:95:0x0194, B:65:0x0118, B:66:0x011b), top: B:103:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x016b A[Catch: CancellationException -> 0x0110, TryCatch #0 {CancellationException -> 0x0110, blocks: (B:59:0x010a, B:75:0x0140, B:76:0x0147, B:78:0x014e, B:86:0x015c, B:87:0x0161, B:90:0x016b, B:91:0x0170, B:93:0x018d, B:95:0x0194, B:65:0x0118, B:66:0x011b), top: B:103:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x018d A[Catch: CancellationException -> 0x0110, TryCatch #0 {CancellationException -> 0x0110, blocks: (B:59:0x010a, B:75:0x0140, B:76:0x0147, B:78:0x014e, B:86:0x015c, B:87:0x0161, B:90:0x016b, B:91:0x0170, B:93:0x018d, B:95:0x0194, B:65:0x0118, B:66:0x011b), top: B:103:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0193  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [cl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Nullable
    public static final Object b(@NotNull String str, @NotNull CaptchaDestination captchaDestination, @NotNull EB eb, @NotNull InterfaceC7931yy interfaceC7931yy, @NotNull List list, @NotNull Map data, @NotNull Function1 function1, @NotNull LM lm) throws Throwable {
        C1652Ny c1652Ny;
        ?? attempt;
        InterfaceC3220cl attempt2;
        boolean z;
        boolean z2;
        Object obj;
        InterfaceC7931yy interfaceC7931yy2;
        InterfaceC5790ol interfaceC5790olD;
        Object obj2;
        InterfaceC3220cl interfaceC3220cl;
        EnumC1886Qy enumC1886Qy;
        boolean z3;
        C2316Wk c2316Wk;
        boolean z4;
        String flow = str;
        CaptchaDestination captchaDestination2 = captchaDestination;
        EB eb2 = eb;
        InterfaceC7931yy interfaceC7931yy3 = interfaceC7931yy;
        Function1 function2 = function1;
        if (lm instanceof C1652Ny) {
            c1652Ny = (C1652Ny) lm;
            int i = c1652Ny.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1652Ny.l = i - Integer.MIN_VALUE;
            } else {
                c1652Ny = new C1652Ny(lm);
            }
        } else {
            c1652Ny = new C1652Ny(lm);
        }
        Object obj3 = c1652Ny.k;
        MN mn = MN.d;
        int i2 = c1652Ny.l;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    InterfaceC3220cl interfaceC3220cl2 = c1652Ny.i;
                    Function1 function3 = c1652Ny.h;
                    interfaceC7931yy2 = c1652Ny.g;
                    CaptchaDestination captchaDestination3 = c1652Ny.e;
                    String str2 = c1652Ny.d;
                    try {
                        C1795Pt1.b(obj3);
                        attempt2 = interfaceC3220cl2;
                        flow = str2;
                        function2 = function3;
                        captchaDestination2 = captchaDestination3;
                        obj = obj3;
                        z2 = true;
                        z = false;
                        EnumC1886Qy enumC1886Qy2 = (EnumC1886Qy) obj;
                        interfaceC7931yy3 = interfaceC7931yy2;
                        interfaceC3220cl = attempt2;
                        enumC1886Qy = enumC1886Qy2;
                        if (interfaceC3220cl != null) {
                            interfaceC3220cl.b("captcha.reason", enumC1886Qy.d);
                        }
                        enumC1886Qy.getClass();
                        if (enumC1886Qy != EnumC1886Qy.REQUIRED) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                        }
                        if (!z3) {
                            if (interfaceC3220cl != null) {
                                interfaceC3220cl.b("captcha.shown", "false");
                            }
                            function2.invoke("");
                            return Unit.a;
                        }
                        if (interfaceC3220cl != null) {
                            interfaceC3220cl.b("captcha.shown", "true");
                        }
                        a("captcha.shown", EnumC0936Eu.d, PW0.e(new Pair("flow", flow), new Pair("reason", enumC1886Qy.d)));
                        if (interfaceC3220cl != null) {
                            c2316Wk = new C2316Wk(flow, interfaceC3220cl);
                        } else {
                            c2316Wk = null;
                        }
                        interfaceC7931yy3.b(function2, captchaDestination2, flow, c2316Wk);
                        return Unit.a;
                    } catch (CancellationException e) {
                        e = e;
                        attempt = interfaceC3220cl2;
                        flow = str2;
                        if (attempt != 0) {
                            ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap = C3430dl.a;
                            Intrinsics.checkNotNullParameter(flow, "flow");
                            Intrinsics.checkNotNullParameter(attempt, "attempt");
                            C3430dl.a.remove(flow, attempt);
                        }
                        if (attempt != 0) {
                            InterfaceC3220cl.a.a(attempt, EnumC4737jl.g, null, null, 6);
                        }
                        throw e;
                    }
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC5790ol interfaceC5790ol = c1652Ny.j;
                interfaceC3220cl = c1652Ny.i;
                Function1 function4 = c1652Ny.h;
                interfaceC7931yy3 = c1652Ny.g;
                CaptchaDestination captchaDestination4 = c1652Ny.e;
                String str3 = c1652Ny.d;
                try {
                    C1795Pt1.b(obj3);
                    function2 = function4;
                    captchaDestination2 = captchaDestination4;
                    obj2 = obj3;
                    interfaceC5790olD = interfaceC5790ol;
                    flow = str3;
                    try {
                        enumC1886Qy = (EnumC1886Qy) obj2;
                        if (enumC1886Qy != EnumC1886Qy.REQUIRED || enumC1886Qy == EnumC1886Qy.NOT_REQUIRED) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        interfaceC5790olD.a(z4);
                        z2 = true;
                        z = false;
                        if (interfaceC3220cl != null) {
                            interfaceC3220cl.b("captcha.reason", enumC1886Qy.d);
                        }
                        enumC1886Qy.getClass();
                        if (enumC1886Qy != EnumC1886Qy.REQUIRED || enumC1886Qy == EnumC1886Qy.CONFIG_FAILED) {
                            z3 = z2;
                        } else {
                            z3 = z;
                        }
                        if (!z3) {
                            if (interfaceC3220cl != null) {
                                interfaceC3220cl.b("captcha.shown", "false");
                            }
                            function2.invoke("");
                            return Unit.a;
                        }
                        if (interfaceC3220cl != null) {
                            interfaceC3220cl.b("captcha.shown", "true");
                        }
                        a("captcha.shown", EnumC0936Eu.d, PW0.e(new Pair("flow", flow), new Pair("reason", enumC1886Qy.d)));
                        if (interfaceC3220cl != null) {
                            c2316Wk = new C2316Wk(flow, interfaceC3220cl);
                        } else {
                            c2316Wk = null;
                        }
                        interfaceC7931yy3.b(function2, captchaDestination2, flow, c2316Wk);
                        return Unit.a;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC5790olD.a(false);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC5790olD = interfaceC5790ol;
                    interfaceC5790olD.a(false);
                    throw th;
                }
            }
            C1795Pt1.b(obj3);
            ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap2 = C3430dl.a;
            Intrinsics.checkNotNullParameter(flow, "flow");
            Intrinsics.checkNotNullParameter(data, "data");
            C2066Tg c2066Tg = U0.R;
            if (c2066Tg != null) {
                attempt2 = (InterfaceC3220cl) c2066Tg.invoke(flow, data);
                InterfaceC3220cl interfaceC3220clPut = C3430dl.a.put(flow, attempt2);
                if (interfaceC3220clPut != null) {
                    InterfaceC3220cl.a.a(interfaceC3220clPut, EnumC4737jl.g, "superseded", null, 4);
                }
                C3430dl.c.put(flow, attempt2.getId());
                C3430dl.b(flow, attempt2);
            } else {
                attempt2 = null;
            }
            try {
                if (!list.isEmpty()) {
                    if (attempt2 != null) {
                        Intrinsics.checkNotNullParameter(flow, "flow");
                        Intrinsics.checkNotNullParameter(attempt2, "attempt");
                        C3430dl.a.remove(flow, attempt2);
                    }
                    if (attempt2 != null) {
                        C6000pl.a(attempt2, list);
                    }
                    return Unit.a;
                }
                if (attempt2 != null) {
                    interfaceC5790olD = attempt2.d("captcha_config");
                    try {
                        c1652Ny.d = flow;
                        c1652Ny.e = captchaDestination2;
                        c1652Ny.g = interfaceC7931yy3;
                        c1652Ny.h = function2;
                        c1652Ny.i = attempt2;
                        c1652Ny.j = interfaceC5790olD;
                        c1652Ny.l = 2;
                        Enum enumA = eb2.a(captchaDestination2, c1652Ny);
                        if (enumA != mn) {
                            InterfaceC3220cl interfaceC3220cl3 = attempt2;
                            obj2 = enumA;
                            interfaceC3220cl = interfaceC3220cl3;
                            enumC1886Qy = (EnumC1886Qy) obj2;
                            if (enumC1886Qy != EnumC1886Qy.REQUIRED) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            interfaceC5790olD.a(z4);
                            z2 = true;
                            z = false;
                            if (interfaceC3220cl != null) {
                                interfaceC3220cl.b("captcha.reason", enumC1886Qy.d);
                            }
                            enumC1886Qy.getClass();
                            if (enumC1886Qy != EnumC1886Qy.REQUIRED) {
                                z3 = z2;
                            } else {
                                z3 = z2;
                            }
                            if (!z3) {
                                if (interfaceC3220cl != null) {
                                    interfaceC3220cl.b("captcha.shown", "false");
                                }
                                function2.invoke("");
                                return Unit.a;
                            }
                            if (interfaceC3220cl != null) {
                                interfaceC3220cl.b("captcha.shown", "true");
                            }
                            a("captcha.shown", EnumC0936Eu.d, PW0.e(new Pair("flow", flow), new Pair("reason", enumC1886Qy.d)));
                            if (interfaceC3220cl != null) {
                                c2316Wk = new C2316Wk(flow, interfaceC3220cl);
                            } else {
                                c2316Wk = null;
                            }
                            interfaceC7931yy3.b(function2, captchaDestination2, flow, c2316Wk);
                            return Unit.a;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC5790olD.a(false);
                        throw th;
                    }
                } else {
                    z = false;
                    c1652Ny.d = flow;
                    c1652Ny.e = captchaDestination2;
                    c1652Ny.g = interfaceC7931yy3;
                    c1652Ny.h = function2;
                    c1652Ny.i = attempt2;
                    z2 = true;
                    c1652Ny.l = 1;
                    Enum enumA2 = eb2.a(captchaDestination2, c1652Ny);
                    if (enumA2 != mn) {
                        obj = enumA2;
                        interfaceC7931yy2 = interfaceC7931yy3;
                        EnumC1886Qy enumC1886Qy3 = (EnumC1886Qy) obj;
                        interfaceC7931yy3 = interfaceC7931yy2;
                        interfaceC3220cl = attempt2;
                        enumC1886Qy = enumC1886Qy3;
                        if (interfaceC3220cl != null) {
                            interfaceC3220cl.b("captcha.reason", enumC1886Qy.d);
                        }
                        enumC1886Qy.getClass();
                        if (enumC1886Qy != EnumC1886Qy.REQUIRED) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                        }
                        if (!z3) {
                            if (interfaceC3220cl != null) {
                                interfaceC3220cl.b("captcha.shown", "false");
                            }
                            function2.invoke("");
                            return Unit.a;
                        }
                        if (interfaceC3220cl != null) {
                            interfaceC3220cl.b("captcha.shown", "true");
                        }
                        a("captcha.shown", EnumC0936Eu.d, PW0.e(new Pair("flow", flow), new Pair("reason", enumC1886Qy.d)));
                        if (interfaceC3220cl != null) {
                            c2316Wk = new C2316Wk(flow, interfaceC3220cl);
                        } else {
                            c2316Wk = null;
                        }
                        interfaceC7931yy3.b(function2, captchaDestination2, flow, c2316Wk);
                        return Unit.a;
                    }
                }
                return mn;
            } catch (CancellationException e2) {
                e = e2;
                attempt = attempt2;
                if (attempt != 0) {
                    ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap3 = C3430dl.a;
                    Intrinsics.checkNotNullParameter(flow, "flow");
                    Intrinsics.checkNotNullParameter(attempt, "attempt");
                    C3430dl.a.remove(flow, attempt);
                }
                if (attempt != 0) {
                    InterfaceC3220cl.a.a(attempt, EnumC4737jl.g, null, null, 6);
                }
                throw e;
            }
        } catch (CancellationException e3) {
            e = e3;
            attempt = eb2;
        }
    }
}
