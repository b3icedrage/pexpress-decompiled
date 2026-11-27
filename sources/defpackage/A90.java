package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class A90 {

    @NotNull
    public final C4979kv a;

    @NotNull
    public final C4795k21 b;

    @Nullable
    public C4672jT c;

    @NotNull
    public final C5804op d;

    @NotNull
    public final UC1 e;

    public A90() {
        throw null;
    }

    public A90(C7416wW1 store, C4979kv builderInfo) {
        C8056za httpClientFactory = C8056za.e;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter("js.glzwizhsaraw3ncm6lpa4.1co5ez1ole9vl51nod9lf", "apiKey");
        Intrinsics.checkNotNullParameter("https://jitsu.pbotservices.com", "host");
        Intrinsics.checkNotNullParameter(builderInfo, "builderInfo");
        Intrinsics.checkNotNullParameter(httpClientFactory, "httpClientFactory");
        this.a = builderInfo;
        this.b = ED.c();
        this.d = new C5804op();
        this.e = new UC1(store);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(List list, LM lm) {
        C5032l90 c5032l90;
        if (lm instanceof C5032l90) {
            c5032l90 = (C5032l90) lm;
            int i = c5032l90.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5032l90.h = i - Integer.MIN_VALUE;
            } else {
                c5032l90 = new C5032l90(this, lm);
            }
        } else {
            c5032l90 = new C5032l90(this, lm);
        }
        Object objG = c5032l90.e;
        MN mn = MN.d;
        int i2 = c5032l90.h;
        if (i2 == 0) {
            C1795Pt1.b(objG);
            c5032l90.d = list;
            c5032l90.h = 1;
            objG = this.e.g(c5032l90);
            if (objG == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = c5032l90.d;
            C1795Pt1.b(objG);
        }
        Map map = (Map) objG;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C7713xv0 c7713xv0 = (C7713xv0) obj;
            if (!Intrinsics.a(map.get(c7713xv0.a), c7713xv0.b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r4.d(r2, r0) == r1) goto L31;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C5245m90
            if (r0 == 0) goto L13
            r0 = r7
            m90 r0 = (defpackage.C5245m90) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            m90 r0 = new m90
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            k21 r2 = r0.e
            A90 r4 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L4d
        L3a:
            defpackage.C1795Pt1.b(r7)
            r0.d = r6
            k21 r2 = r6.b
            r0.e = r2
            r0.i = r4
            java.lang.Object r7 = r2.a(r0)
            if (r7 != r1) goto L4c
            goto L72
        L4c:
            r4 = r6
        L4d:
            r7 = 0
            jT r5 = r4.c     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L58
            r2.b(r7)
            return r0
        L58:
            r0 = move-exception
            goto L76
        L5a:
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L58
            r2.b(r7)
            a80$b r2 = defpackage.C2658a80.Companion
            r2.getClass()
            a80 r2 = defpackage.C2658a80.c
            r0.d = r7
            r0.e = r7
            r0.i = r3
            java.lang.Object r7 = r4.d(r2, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L76:
            r2.b(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A90.b(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:50:0x018a  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[LOOP:0: B:48:0x0184->B:64:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00fe -> B:30:0x0105). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List r17, defpackage.InterfaceC1060Gj0 r18, defpackage.InterfaceC1060Gj0 r19, kotlin.jvm.functions.Function2 r20, kotlin.jvm.functions.Function2 r21, defpackage.LM r22) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A90.c(java.util.List, Gj0, Gj0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object d(@NotNull C2658a80 c2658a80, @NotNull LM lm) throws Throwable {
        C5665o90 c5665o90;
        C4795k21 c4795k21;
        A90 a90;
        Throwable th;
        InterfaceC4117h21 interfaceC4117h21;
        if (lm instanceof C5665o90) {
            c5665o90 = (C5665o90) lm;
            int i = c5665o90.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5665o90.j = i - Integer.MIN_VALUE;
            } else {
                c5665o90 = new C5665o90(this, lm);
            }
        } else {
            c5665o90 = new C5665o90(this, lm);
        }
        C5665o90 c5665o91 = c5665o90;
        Object obj = c5665o91.h;
        MN mn = MN.d;
        int i2 = c5665o91.j;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                c5665o91.d = this;
                c5665o91.e = c2658a80;
                c4795k21 = this.b;
                c5665o91.g = c4795k21;
                c5665o91.j = 1;
                if (c4795k21.a(c5665o91) != mn) {
                    a90 = this;
                }
                return mn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4117h21 = (InterfaceC4117h21) c5665o91.d;
                try {
                    C1795Pt1.b(obj);
                    Unit unit = Unit.a;
                    interfaceC4117h21.b(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC4117h21.b(null);
                    throw th;
                }
            }
            C4795k21 c4795k22 = c5665o91.g;
            C2658a80 c2658a81 = c5665o91.e;
            A90 a91 = (A90) c5665o91.d;
            C1795Pt1.b(obj);
            c4795k21 = c4795k22;
            c2658a80 = c2658a81;
            a90 = a91;
            List listC = VE.c(c2658a80);
            C5875p90 c5875p90 = new C5875p90(a90, null);
            C6085q90 c6085q90 = new C6085q90(3, null);
            C6294r90 c6294r90 = new C6294r90(2, null);
            C6504s90 c6504s90 = new C6504s90(2, null);
            c5665o91.d = c4795k21;
            c5665o91.e = null;
            c5665o91.g = null;
            c5665o91.j = 2;
            if (a90.c(listC, c5875p90, c6085q90, c6294r90, c6504s90, c5665o91) != mn) {
                interfaceC4117h21 = c4795k21;
                Unit unit2 = Unit.a;
                interfaceC4117h21.b(null);
                return unit2;
            }
            return mn;
        } catch (Throwable th3) {
            C4795k21 c4795k23 = c4795k21;
            th = th3;
            interfaceC4117h21 = c4795k23;
            interfaceC4117h21.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull LM lm) throws Throwable {
        C6714t90 c6714t90;
        InterfaceC4117h21 interfaceC4117h21;
        A90 a90;
        InterfaceC4117h21 interfaceC4117h22;
        Throwable th;
        InterfaceC3881fv interfaceC3881fv;
        InterfaceC4117h21 interfaceC4117h23;
        C2658a80 c2658a80;
        A90 a91;
        if (lm instanceof C6714t90) {
            c6714t90 = (C6714t90) lm;
            int i = c6714t90.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6714t90.k = i - Integer.MIN_VALUE;
            } else {
                c6714t90 = new C6714t90(this, lm);
            }
        } else {
            c6714t90 = new C6714t90(this, lm);
        }
        Object objB = c6714t90.i;
        MN mn = MN.d;
        int i2 = c6714t90.k;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objB);
                c6714t90.d = this;
                interfaceC4117h21 = this.b;
                c6714t90.e = interfaceC4117h21;
                c6714t90.k = 1;
                if (interfaceC4117h21.a(c6714t90) != mn) {
                    a90 = this;
                }
                return mn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a91 = (A90) c6714t90.e;
                    interfaceC4117h22 = (InterfaceC4117h21) c6714t90.d;
                    try {
                        C1795Pt1.b(objB);
                        a91.c = (C4672jT) objB;
                        Unit unit = Unit.a;
                        interfaceC4117h22.b(null);
                        return unit;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC4117h22.b(null);
                        throw th;
                    }
                }
                interfaceC3881fv = c6714t90.h;
                c2658a80 = c6714t90.g;
                a90 = (A90) c6714t90.e;
                interfaceC4117h23 = (InterfaceC4117h21) c6714t90.d;
                try {
                    C1795Pt1.b(objB);
                    c6714t90.d = interfaceC4117h23;
                    c6714t90.e = a90;
                    c6714t90.g = null;
                    c6714t90.h = null;
                    c6714t90.k = 3;
                    objB = interfaceC3881fv.b(c2658a80, (Map) objB, c6714t90);
                    if (objB != mn) {
                        a91 = a90;
                        interfaceC4117h22 = interfaceC4117h23;
                        a91.c = (C4672jT) objB;
                        Unit unit2 = Unit.a;
                        interfaceC4117h22.b(null);
                        return unit2;
                    }
                    return mn;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC4117h22 = interfaceC4117h23;
                    interfaceC4117h22.b(null);
                    throw th;
                }
            }
            InterfaceC4117h21 interfaceC4117h24 = (InterfaceC4117h21) c6714t90.e;
            a90 = (A90) c6714t90.d;
            C1795Pt1.b(objB);
            interfaceC4117h21 = interfaceC4117h24;
            interfaceC3881fv = a90.a;
            C2658a80.Companion.getClass();
            C2658a80 c2658a81 = C2658a80.d;
            UC1 uc1 = a90.e;
            c6714t90.d = interfaceC4117h21;
            c6714t90.e = a90;
            c6714t90.g = c2658a81;
            c6714t90.h = interfaceC3881fv;
            c6714t90.k = 2;
            Serializable serializableG = uc1.g(c6714t90);
            if (serializableG != mn) {
                interfaceC4117h23 = interfaceC4117h21;
                objB = serializableG;
                c2658a80 = c2658a81;
                c6714t90.d = interfaceC4117h23;
                c6714t90.e = a90;
                c6714t90.g = null;
                c6714t90.h = null;
                c6714t90.k = 3;
                objB = interfaceC3881fv.b(c2658a80, (Map) objB, c6714t90);
                if (objB != mn) {
                    a91 = a90;
                    interfaceC4117h22 = interfaceC4117h23;
                    a91.c = (C4672jT) objB;
                    Unit unit3 = Unit.a;
                    interfaceC4117h22.b(null);
                    return unit3;
                }
            }
            return mn;
        } catch (Throwable th4) {
            interfaceC4117h22 = interfaceC4117h21;
            th = th4;
            interfaceC4117h22.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, xv0] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [h21] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [h21] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    @Nullable
    public final Object f(@NotNull C7713xv0 c7713xv0, @NotNull LM lm) throws Throwable {
        C6924u90 c6924u90;
        Throwable th;
        ?? r12;
        InterfaceC4117h21 interfaceC4117h21;
        A90 a90;
        ?? r13;
        InterfaceC4117h21 interfaceC4117h22;
        List list;
        List list2;
        A90 a91;
        C7134v90 c7134v90;
        C7344w90 c7344w90;
        C7555x90 c7555x90;
        C7765y90 c7765y90;
        if (lm instanceof C6924u90) {
            c6924u90 = (C6924u90) lm;
            int i = c6924u90.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6924u90.j = i - Integer.MIN_VALUE;
            } else {
                c6924u90 = new C6924u90(this, lm);
            }
        } else {
            c6924u90 = new C6924u90(this, lm);
        }
        C6924u90 c6924u91 = c6924u90;
        Object obj = c6924u91.h;
        MN mn = MN.d;
        int i2 = c6924u91.j;
        try {
            try {
                if (i2 == 0) {
                    C1795Pt1.b(obj);
                    c6924u91.d = this;
                    c6924u91.e = c7713xv0;
                    interfaceC4117h21 = this.b;
                    c6924u91.g = interfaceC4117h21;
                    c6924u91.j = 1;
                    if (interfaceC4117h21.a(c6924u91) != mn) {
                        a90 = this;
                        r13 = c7713xv0;
                    }
                    return mn;
                }
                if (i2 == 1) {
                    InterfaceC4117h21 interfaceC4117h23 = (InterfaceC4117h21) c6924u91.g;
                    C7713xv0 c7713xv1 = (C7713xv0) c6924u91.e;
                    a90 = (A90) c6924u91.d;
                    C1795Pt1.b(obj);
                    interfaceC4117h21 = interfaceC4117h23;
                    r13 = c7713xv1;
                } else {
                    if (i2 == 2) {
                        interfaceC4117h22 = (InterfaceC4117h21) c6924u91.e;
                        A90 a92 = (A90) c6924u91.d;
                        C1795Pt1.b(obj);
                        a90 = a92;
                        list = (List) obj;
                        c6924u91.d = a90;
                        c6924u91.e = interfaceC4117h22;
                        c6924u91.g = list;
                        c6924u91.j = 3;
                        if (a90.g(list, c6924u91) != mn) {
                            interfaceC4117h21 = interfaceC4117h22;
                            list2 = list;
                            a91 = a90;
                            c7134v90 = new C7134v90(a91, null);
                            c7344w90 = new C7344w90(3, null);
                            c7555x90 = new C7555x90(2, null);
                            c7765y90 = new C7765y90(2, null);
                            c6924u91.d = interfaceC4117h21;
                            c6924u91.e = null;
                            c6924u91.g = null;
                            c6924u91.j = 4;
                            if (a91.c(list2, c7134v90, c7344w90, c7555x90, c7765y90, c6924u91) != mn) {
                                c7713xv0 = interfaceC4117h21;
                            }
                        }
                        return mn;
                    }
                    if (i2 == 3) {
                        list2 = (List) c6924u91.g;
                        InterfaceC4117h21 interfaceC4117h24 = (InterfaceC4117h21) c6924u91.e;
                        a90 = (A90) c6924u91.d;
                        try {
                            C1795Pt1.b(obj);
                            interfaceC4117h21 = interfaceC4117h24;
                            a91 = a90;
                            c7134v90 = new C7134v90(a91, null);
                            c7344w90 = new C7344w90(3, null);
                            c7555x90 = new C7555x90(2, null);
                            c7765y90 = new C7765y90(2, null);
                            c6924u91.d = interfaceC4117h21;
                            c6924u91.e = null;
                            c6924u91.g = null;
                            c6924u91.j = 4;
                            if (a91.c(list2, c7134v90, c7344w90, c7555x90, c7765y90, c6924u91) != mn) {
                                c7713xv0 = interfaceC4117h21;
                            }
                            return mn;
                        } catch (Throwable th2) {
                            th = th2;
                            r12 = interfaceC4117h24;
                            r12.b(null);
                            throw th;
                        }
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC4117h21 interfaceC4117h25 = (InterfaceC4117h21) c6924u91.d;
                    C1795Pt1.b(obj);
                    c7713xv0 = interfaceC4117h25;
                }
                Unit unit = Unit.a;
                c7713xv0.b(null);
                return unit;
                List listC = VE.c(r13);
                c6924u91.d = a90;
                c6924u91.e = interfaceC4117h21;
                c6924u91.g = null;
                c6924u91.j = 2;
                Serializable serializableA = a90.a(listC, c6924u91);
                if (serializableA != mn) {
                    InterfaceC4117h21 interfaceC4117h26 = interfaceC4117h21;
                    obj = serializableA;
                    interfaceC4117h22 = interfaceC4117h26;
                    list = (List) obj;
                    c6924u91.d = a90;
                    c6924u91.e = interfaceC4117h22;
                    c6924u91.g = list;
                    c6924u91.j = 3;
                    if (a90.g(list, c6924u91) != mn) {
                        interfaceC4117h21 = interfaceC4117h22;
                        list2 = list;
                        a91 = a90;
                        c7134v90 = new C7134v90(a91, null);
                        c7344w90 = new C7344w90(3, null);
                        c7555x90 = new C7555x90(2, null);
                        c7765y90 = new C7765y90(2, null);
                        c6924u91.d = interfaceC4117h21;
                        c6924u91.e = null;
                        c6924u91.g = null;
                        c6924u91.j = 4;
                        if (a91.c(list2, c7134v90, c7344w90, c7555x90, c7765y90, c6924u91) != mn) {
                            c7713xv0 = interfaceC4117h21;
                            Unit unit2 = Unit.a;
                            c7713xv0.b(null);
                            return unit2;
                        }
                    }
                }
                return mn;
            } catch (Throwable th3) {
                InterfaceC4117h21 interfaceC4117h27 = interfaceC4117h21;
                th = th3;
                r12 = interfaceC4117h27;
                r12.b(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r12 = c7713xv0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(List list, LM lm) {
        C7975z90 c7975z90;
        Iterator it;
        A90 a90;
        if (lm instanceof C7975z90) {
            c7975z90 = (C7975z90) lm;
            int i = c7975z90.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7975z90.i = i - Integer.MIN_VALUE;
            } else {
                c7975z90 = new C7975z90(this, lm);
            }
        } else {
            c7975z90 = new C7975z90(this, lm);
        }
        Object obj = c7975z90.g;
        MN mn = MN.d;
        int i2 = c7975z90.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            it = list.iterator();
            a90 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c7975z90.e;
            a90 = c7975z90.d;
            C1795Pt1.b(obj);
        }
        while (it.hasNext()) {
            C7713xv0 c7713xv0 = (C7713xv0) it.next();
            UC1 uc1 = a90.e;
            c7975z90.d = a90;
            c7975z90.e = it;
            c7975z90.i = 1;
            DR0 dr0 = uc1.b;
            String str = c7713xv0.a;
            AbstractC5267mG0.a aVar = uc1.a;
            aVar.getClass();
            Object objA = dr0.a(str, aVar.b(JsonElement.Companion.serializer(), c7713xv0.b), EnumC2758ad2.Properties, c7975z90);
            if (objA != MN.d) {
                objA = Unit.a;
            }
            if (objA == mn) {
                return mn;
            }
        }
        return Unit.a;
    }
}
