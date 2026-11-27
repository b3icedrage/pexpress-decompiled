package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2836aw implements InterfaceC6245qw, InterfaceC0942Ew, InterfaceC1958Rw {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C2836aw.class, Object.class, "_state");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(C2836aw.class, Object.class, "_closed");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(C2836aw.class, Object.class, "_readOp");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(C2836aw.class, Object.class, "_writeOp");

    @NotNull
    private volatile /* synthetic */ Object _closed;

    @NotNull
    private volatile /* synthetic */ Object _readOp;

    @NotNull
    private volatile /* synthetic */ Object _state;

    @NotNull
    volatile /* synthetic */ Object _writeOp;

    @Nullable
    private volatile XF0 attachedJob;
    public final boolean b;

    @NotNull
    public final O71<AbstractC1229In1.c> c;
    public final int d;
    public int e;
    public int f;

    @NotNull
    public final C7090uy<Boolean> g;

    @NotNull
    public final C7090uy<Unit> h;

    @NotNull
    public final b i;

    @Nullable
    private volatile C4634jG0 joining;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    /* JADX INFO: renamed from: aw$a */
    public static final class a extends ML0 implements Function1<Throwable, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            C2836aw c2836aw = C2836aw.this;
            c2836aw.attachedJob = null;
            if (th2 != null) {
                Intrinsics.checkNotNullParameter(th2, "<this>");
                Throwable th3 = th2;
                while (true) {
                    if (th3 instanceof CancellationException) {
                        if (th3.equals(th3.getCause())) {
                            break;
                        }
                        Throwable cause = th3.getCause();
                        if (cause != null) {
                            th3 = cause;
                        }
                    }
                    th2 = th3;
                    break;
                }
                c2836aw.a(th2);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: aw$b */
    public static final class b extends ML0 implements Function1<JM<? super Unit>, Object> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) throws Throwable {
            JM<? super Unit> ucont = jm;
            Intrinsics.checkNotNullParameter(ucont, "ucont");
            int i = C2836aw.this.writeSuspensionSize;
            loop0: while (true) {
                C6100qE c6100qEM = C2836aw.m(C2836aw.this);
                if (c6100qEM != null) {
                    C5027l8.b(c6100qEM.a());
                    throw null;
                }
                if (!C2836aw.this.a0(i)) {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    ucont.resumeWith(Unit.a);
                    break;
                }
                C2836aw c2836aw = C2836aw.this;
                JM jmB = C5885pC0.b(ucont);
                C2836aw c2836aw2 = C2836aw.this;
                while (true) {
                    if (((JM) c2836aw._writeOp) != null) {
                        throw new IllegalStateException("Operation is already in progress");
                    }
                    if (!c2836aw2.a0(i)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2836aw.m;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c2836aw, null, jmB)) {
                            if (!c2836aw2.a0(i)) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2836aw.m;
                                while (!atomicReferenceFieldUpdater2.compareAndSet(c2836aw, jmB, null)) {
                                    if (atomicReferenceFieldUpdater2.get(c2836aw) != jmB) {
                                        break loop0;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(c2836aw) == null);
                }
            }
            C2836aw.this.w(i);
            if (C2836aw.this.N()) {
                C2836aw.this.J();
            }
            return MN.d;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2836aw(@NotNull ByteBuffer content) {
        this(false, P71.d, 0);
        Intrinsics.checkNotNullParameter(content, "content");
        ByteBuffer byteBufferSlice = content.slice();
        Intrinsics.checkNotNullExpressionValue(byteBufferSlice, "content.slice()");
        AbstractC1229In1.c cVar = new AbstractC1229In1.c(byteBufferSlice, 0);
        C6660su1 c6660su1 = cVar.b;
        c6660su1._availableForRead$internal = c6660su1.a;
        c6660su1._availableForWrite$internal = 0;
        c6660su1._pendingToFlush = 0;
        this._state = cVar.g;
        I();
        C4994l.b(this);
        R();
    }

    public static void G(C2836aw c2836aw, C4634jG0 c4634jG0) {
        if (((AbstractC1229In1) c2836aw._state) != AbstractC1229In1.f.c) {
            return;
        }
        c4634jG0.getClass();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object T(C2836aw c2836aw, int i, E81.a aVar, LM lm) throws Throwable {
        C4304hw c4304hw;
        Function1 block;
        C2836aw c2836aw2;
        int i2;
        int i3;
        if (lm instanceof C4304hw) {
            c4304hw = (C4304hw) lm;
            int i4 = c4304hw.j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c4304hw.j = i4 - Integer.MIN_VALUE;
            } else {
                c4304hw = new C4304hw(c2836aw, lm);
            }
        } else {
            c4304hw = new C4304hw(c2836aw, lm);
        }
        Object obj = c4304hw.h;
        MN mn = MN.d;
        int i5 = c4304hw.j;
        if (i5 == 0) {
            C1795Pt1.b(obj);
            c2836aw2 = c2836aw;
            block = aVar;
            if (i <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i > 4088) {
                throw new IllegalArgumentException(C1332Jw.a(i, "Min(", ") should'nt be greater than (4088)").toString());
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = c4304hw.g;
            Function1 function1 = c4304hw.e;
            C2836aw c2836aw3 = c4304hw.d;
            C1795Pt1.b(obj);
            i = i6;
            c2836aw2 = c2836aw3;
            block = function1;
        }
        do {
            c2836aw2.getClass();
            Intrinsics.checkNotNullParameter(block, "block");
            if (i <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i > 4088) {
                throw new IllegalArgumentException(C1332Jw.a(i, "Min(", ") shouldn't be greater than 4088").toString());
            }
            C4634jG0 c4634jG0 = c2836aw2.joining;
            if (c4634jG0 != null) {
                G(c2836aw2, c4634jG0);
            }
            ByteBuffer byteBufferM = c2836aw2.M();
            boolean z = false;
            if (byteBufferM == null) {
                i3 = 0;
            } else {
                C6660su1 c6660su1 = ((AbstractC1229In1) c2836aw2._state).b;
                try {
                    C6100qE c6100qE = (C6100qE) c2836aw2._closed;
                    if (c6100qE != null) {
                        C5027l8.b(c6100qE.a());
                        throw null;
                    }
                    do {
                        i2 = c6660su1._availableForWrite$internal;
                        if (i2 < i) {
                            i2 = 0;
                            break;
                        }
                    } while (!C6660su1.c.compareAndSet(c6660su1, i2, 0));
                    if (i2 <= 0) {
                        i3 = 0;
                    } else {
                        c2836aw2.x(byteBufferM, c2836aw2.f, i2);
                        int iPosition = byteBufferM.position();
                        int iLimit = byteBufferM.limit();
                        block.invoke(byteBufferM);
                        if (iLimit != byteBufferM.limit()) {
                            throw new IllegalStateException("Buffer limit modified");
                        }
                        int iPosition2 = byteBufferM.position() - iPosition;
                        if (iPosition2 < 0) {
                            throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                        }
                        if (iPosition2 < 0) {
                            throw new IllegalStateException();
                        }
                        c2836aw2.s(byteBufferM, c6660su1, iPosition2);
                        if (iPosition2 < i2) {
                            c6660su1.a(i2 - iPosition2);
                        }
                        i3 = iPosition2;
                        z = true;
                    }
                    if (c6660su1.c() || c2836aw2.b) {
                        c2836aw2.w(1);
                    }
                    c2836aw2.I();
                    c2836aw2.R();
                } catch (Throwable th) {
                    if (c6660su1.c() || c2836aw2.b) {
                        c2836aw2.w(1);
                    }
                    c2836aw2.I();
                    c2836aw2.R();
                    throw th;
                }
            }
            if (!z) {
                i3 = -1;
            }
            if (i3 >= 0) {
                return Unit.a;
            }
            c4304hw.d = c2836aw2;
            c4304hw.e = block;
            c4304hw.g = i;
            c4304hw.j = 1;
        } while (c2836aw2.q(i, block, c4304hw) != mn);
        return mn;
    }

    public static final C6100qE m(C2836aw c2836aw) {
        return (C6100qE) c2836aw._closed;
    }

    public static int z(C2836aw c2836aw, C2895bC c2895bC) throws Throwable {
        int iF;
        boolean z;
        int i = c2895bC.e - c2895bC.c;
        int i2 = 0;
        do {
            ByteBuffer byteBufferL = c2836aw.L();
            if (byteBufferL == null) {
                z = false;
                iF = 0;
            } else {
                C6660su1 c6660su1 = ((AbstractC1229In1) c2836aw._state).b;
                try {
                    if (c6660su1._availableForRead$internal == 0) {
                        c2836aw.H();
                        c2836aw.R();
                        z = false;
                        iF = 0;
                    } else {
                        int i3 = c2895bC.e - c2895bC.c;
                        iF = c6660su1.f(Math.min(byteBufferL.remaining(), Math.min(i3, i)));
                        if (iF <= 0) {
                            z = false;
                        } else {
                            if (i3 < byteBufferL.remaining()) {
                                byteBufferL.limit(byteBufferL.position() + i3);
                            }
                            C6621sj.s(c2895bC, byteBufferL);
                            c2836aw.r(byteBufferL, c6660su1, iF);
                            z = true;
                        }
                        c2836aw.H();
                        c2836aw.R();
                    }
                } catch (Throwable th) {
                    c2836aw.H();
                    c2836aw.R();
                    throw th;
                }
            }
            i2 += iF;
            i -= iF;
            if (!z || c2895bC.e <= c2895bC.c) {
                break;
            }
        } while (((AbstractC1229In1) c2836aw._state).b._availableForRead$internal > 0);
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(C2895bC c2895bC, LM lm) throws Throwable {
        C3674ew c3674ew;
        C2836aw c2836aw;
        if (lm instanceof C3674ew) {
            c3674ew = (C3674ew) lm;
            int i = c3674ew.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3674ew.i = i - Integer.MIN_VALUE;
            } else {
                c3674ew = new C3674ew(this, lm);
            }
        } else {
            c3674ew = new C3674ew(this, lm);
        }
        Object objD = c3674ew.g;
        MN mn = MN.d;
        int i2 = c3674ew.i;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            c3674ew.d = this;
            c3674ew.e = c2895bC;
            c3674ew.i = 1;
            objD = D(c3674ew);
            if (objD != mn) {
                c2836aw = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objD);
            return objD;
        }
        c2895bC = c3674ew.e;
        c2836aw = c3674ew.d;
        C1795Pt1.b(objD);
        if (!((Boolean) objD).booleanValue()) {
            return new Integer(-1);
        }
        c3674ew.d = null;
        c3674ew.e = null;
        c3674ew.i = 2;
        Object objE = c2836aw.e(c2895bC, c3674ew);
        return objE == mn ? mn : objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(byte[] bArr, int i, int i2, LM lm) throws Throwable {
        C3464dw c3464dw;
        C2836aw c2836aw;
        if (lm instanceof C3464dw) {
            c3464dw = (C3464dw) lm;
            int i3 = c3464dw.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3464dw.k = i3 - Integer.MIN_VALUE;
            } else {
                c3464dw = new C3464dw(this, lm);
            }
        } else {
            c3464dw = new C3464dw(this, lm);
        }
        Object objD = c3464dw.i;
        MN mn = MN.d;
        int i4 = c3464dw.k;
        if (i4 == 0) {
            C1795Pt1.b(objD);
            c3464dw.d = this;
            c3464dw.e = bArr;
            c3464dw.g = i;
            c3464dw.h = i2;
            c3464dw.k = 1;
            objD = D(c3464dw);
            if (objD != mn) {
                c2836aw = this;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objD);
            return objD;
        }
        i2 = c3464dw.h;
        i = c3464dw.g;
        bArr = c3464dw.e;
        c2836aw = c3464dw.d;
        C1795Pt1.b(objD);
        if (!((Boolean) objD).booleanValue()) {
            return new Integer(-1);
        }
        c3464dw.d = null;
        c3464dw.e = null;
        c3464dw.k = 2;
        Object objJ = c2836aw.j(bArr, i, i2, c3464dw);
        return objJ == mn ? mn : objJ;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c A[PHI: r2 r4 r5 r11 r12
      0x009c: PHI (r2v3 ap1) = (r2v4 ap1), (r2v4 ap1), (r2v6 ap1) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r4v3 Dw) = (r4v4 Dw), (r4v4 Dw), (r4v6 Dw) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r5v1 aw) = (r5v2 aw), (r5v2 aw), (r5v4 aw) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r11v6 bC) = (r11v7 bC), (r11v7 bC), (r11v12 bC) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r12v2 Dw) = (r12v3 Dw), (r12v3 Dw), (r12v5 Dw) binds: [B:25:0x0077, B:27:0x007d, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009f A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:31:0x0092, B:36:0x009f, B:21:0x0054, B:23:0x0060, B:24:0x0069, B:26:0x0079, B:28:0x007f), top: B:50:0x002d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:31:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009c -> B:35:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object C(long r11, defpackage.LM r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.C3884fw
            if (r0 == 0) goto L13
            r0 = r13
            fw r0 = (defpackage.C3884fw) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            fw r0 = new fw
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.j
            MN r1 = defpackage.MN.d
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            bC r11 = r0.i
            Dw r12 = r0.h
            ap1 r2 = r0.g
            Dw r4 = r0.e
            aw r5 = r0.d
            defpackage.C1795Pt1.b(r13)     // Catch: java.lang.Throwable -> L31
            goto L92
        L31:
            r11 = move-exception
            goto Lb6
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            defpackage.C1795Pt1.b(r13)
            Dw r13 = new Dw
            r2 = 0
            r13.<init>(r2)
            ap1 r4 = new ap1     // Catch: java.lang.Throwable -> Lba
            r4.<init>()     // Catch: java.lang.Throwable -> Lba
            r4.d = r11     // Catch: java.lang.Throwable -> Lba
            bC r11 = defpackage.C5189lv.n(r13, r3, r2)     // Catch: java.lang.Throwable -> Lba
            r5 = r10
            r12 = r13
            r2 = r4
            r4 = r12
        L54:
            int r13 = r11.e     // Catch: java.lang.Throwable -> L31
            int r6 = r11.c     // Catch: java.lang.Throwable -> L31
            int r13 = r13 - r6
            long r6 = (long) r13     // Catch: java.lang.Throwable -> L31
            long r8 = r2.d     // Catch: java.lang.Throwable -> L31
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L69
            int r13 = (int) r8     // Catch: java.lang.Throwable -> L31
            int r6 = r11.d     // Catch: java.lang.Throwable -> L31
            r11.b = r6     // Catch: java.lang.Throwable -> L31
            r11.c = r6     // Catch: java.lang.Throwable -> L31
            r11.e = r13     // Catch: java.lang.Throwable -> L31
        L69:
            int r13 = z(r5, r11)     // Catch: java.lang.Throwable -> L31
            long r6 = r2.d     // Catch: java.lang.Throwable -> L31
            long r8 = (long) r13     // Catch: java.lang.Throwable -> L31
            long r6 = r6 - r8
            r2.d = r6     // Catch: java.lang.Throwable -> L31
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L9c
            boolean r13 = r5.k()     // Catch: java.lang.Throwable -> L31
            if (r13 != 0) goto L9c
            r0.d = r5     // Catch: java.lang.Throwable -> L31
            r0.e = r4     // Catch: java.lang.Throwable -> L31
            r0.g = r2     // Catch: java.lang.Throwable -> L31
            r0.h = r12     // Catch: java.lang.Throwable -> L31
            r0.i = r11     // Catch: java.lang.Throwable -> L31
            r0.l = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r13 = r5.D(r0)     // Catch: java.lang.Throwable -> L31
            if (r13 != r1) goto L92
            return r1
        L92:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L31
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r13 == 0) goto L9c
            r13 = r3
            goto L9d
        L9c:
            r13 = 0
        L9d:
            if (r13 == 0) goto La4
            bC r11 = defpackage.C5189lv.n(r12, r3, r11)     // Catch: java.lang.Throwable -> L31
            goto L54
        La4:
            r12.c()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Throwable r11 = r5.b()     // Catch: java.lang.Throwable -> Lb2
            if (r11 != 0) goto Lb5
            Gw r11 = r4.t()     // Catch: java.lang.Throwable -> Lb2
            return r11
        Lb2:
            r11 = move-exception
            r13 = r4
            goto Lbb
        Lb5:
            throw r11     // Catch: java.lang.Throwable -> Lb2
        Lb6:
            r12.c()     // Catch: java.lang.Throwable -> Lb2
            throw r11     // Catch: java.lang.Throwable -> Lb2
        Lba:
            r11 = move-exception
        Lbb:
            r13.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2836aw.C(long, LM):java.lang.Object");
    }

    public final Object D(LM lm) throws Throwable {
        if (((AbstractC1229In1) this._state).b._availableForRead$internal >= 1) {
            return Boolean.TRUE;
        }
        C6100qE c6100qE = (C6100qE) this._closed;
        if (c6100qE == null) {
            return E(1, lm);
        }
        Throwable th = c6100qE.a;
        if (th != null) {
            C5027l8.b(th);
            throw null;
        }
        C6660su1 c6660su1 = ((AbstractC1229In1) this._state).b;
        boolean z = c6660su1.b() && c6660su1._availableForRead$internal >= 1;
        if (((JM) this._readOp) == null) {
            return Boolean.valueOf(z);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(int i, LM lm) throws Throwable {
        C4094gw frame;
        C2836aw c2836aw;
        if (lm instanceof C4094gw) {
            frame = (C4094gw) lm;
            int i2 = frame.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                frame.h = i2 - Integer.MIN_VALUE;
            } else {
                frame = new C4094gw(this, lm);
            }
        } else {
            frame = new C4094gw(this, lm);
        }
        Object obj = frame.e;
        MN mn = MN.d;
        int i3 = frame.h;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            AbstractC1229In1 abstractC1229In1 = (AbstractC1229In1) this._state;
            if (abstractC1229In1.b._availableForRead$internal >= i || !(this.joining == null || ((JM) this._writeOp) == null || (abstractC1229In1 != AbstractC1229In1.a.c && !(abstractC1229In1 instanceof AbstractC1229In1.b)))) {
                return Boolean.TRUE;
            }
            try {
                frame.d = this;
                frame.h = 1;
                C7090uy<Boolean> c7090uy = this.g;
                O(i, c7090uy);
                Object objD = c7090uy.d(C5885pC0.b(frame));
                if (objD == mn) {
                    try {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    } catch (Throwable th) {
                        th = th;
                        c2836aw = this;
                        c2836aw._readOp = null;
                        throw th;
                    }
                }
                return objD == mn ? mn : objD;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2836aw = frame.d;
            try {
                C1795Pt1.b(obj);
                return obj;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        c2836aw._readOp = null;
        throw th;
    }

    public final void F(AbstractC1229In1.c cVar) {
        this.c.g1(cVar);
    }

    public final void H() {
        AbstractC1229In1 abstractC1229In1E;
        AbstractC1229In1 abstractC1229In1 = null;
        loop0: while (true) {
            Object obj = this._state;
            AbstractC1229In1 abstractC1229In2 = (AbstractC1229In1) obj;
            AbstractC1229In1.b bVar = (AbstractC1229In1.b) abstractC1229In1;
            if (bVar != null) {
                bVar.b.d();
                K();
                abstractC1229In1 = null;
            }
            abstractC1229In1E = abstractC1229In2.e();
            if ((abstractC1229In1E instanceof AbstractC1229In1.b) && ((AbstractC1229In1) this._state) == abstractC1229In2 && abstractC1229In1E.b.e()) {
                abstractC1229In1E = AbstractC1229In1.a.c;
                abstractC1229In1 = abstractC1229In1E;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1229In1E)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        AbstractC1229In1.a aVar = AbstractC1229In1.a.c;
        if (abstractC1229In1E == aVar) {
            AbstractC1229In1.b bVar2 = (AbstractC1229In1.b) abstractC1229In1;
            if (bVar2 != null) {
                F(bVar2.c);
            }
            K();
            return;
        }
        if (abstractC1229In1E instanceof AbstractC1229In1.b) {
            C6660su1 c6660su1 = abstractC1229In1E.b;
            if (c6660su1._availableForWrite$internal == c6660su1.a && abstractC1229In1E.b.e()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC1229In1E, aVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != abstractC1229In1E) {
                        return;
                    }
                }
                abstractC1229In1E.b.d();
                F(((AbstractC1229In1.b) abstractC1229In1E).c);
                K();
            }
        }
    }

    public final void I() {
        AbstractC1229In1 abstractC1229In1F;
        AbstractC1229In1.b bVar;
        AbstractC1229In1 abstractC1229In1 = null;
        loop0: while (true) {
            Object obj = this._state;
            abstractC1229In1F = ((AbstractC1229In1) obj).f();
            if (abstractC1229In1F instanceof AbstractC1229In1.b) {
                C6660su1 c6660su1 = abstractC1229In1F.b;
                if (c6660su1._availableForWrite$internal == c6660su1.a) {
                    abstractC1229In1F = AbstractC1229In1.a.c;
                    abstractC1229In1 = abstractC1229In1F;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1229In1F)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        if (abstractC1229In1F != AbstractC1229In1.a.c || (bVar = (AbstractC1229In1.b) abstractC1229In1) == null) {
            return;
        }
        F(bVar.c);
    }

    public final void J() {
        JM jm = (JM) l.getAndSet(this, null);
        if (jm != null) {
            C6100qE c6100qE = (C6100qE) this._closed;
            Throwable th = c6100qE != null ? c6100qE.a : null;
            if (th != null) {
                C1717Ot1.a aVar = C1717Ot1.e;
                jm.resumeWith(C1795Pt1.a(th));
            } else {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                jm.resumeWith(Boolean.TRUE);
            }
        }
    }

    public final void K() {
        while (true) {
            JM jm = (JM) this._writeOp;
            if (jm == null) {
                return;
            }
            C6100qE c6100qE = (C6100qE) this._closed;
            if (c6100qE == null && this.joining != null) {
                AbstractC1229In1 abstractC1229In1 = (AbstractC1229In1) this._state;
                if (!(abstractC1229In1 instanceof AbstractC1229In1.g) && !(abstractC1229In1 instanceof AbstractC1229In1.e) && abstractC1229In1 != AbstractC1229In1.f.c) {
                    return;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, jm, null)) {
                    if (c6100qE == null) {
                        C1717Ot1.a aVar = C1717Ot1.e;
                        jm.resumeWith(Unit.a);
                        return;
                    } else {
                        C1717Ot1.a aVar2 = C1717Ot1.e;
                        jm.resumeWith(C1795Pt1.a(c6100qE.a()));
                        return;
                    }
                }
            } while (atomicReferenceFieldUpdater.get(this) == jm);
        }
    }

    public final ByteBuffer L() throws Throwable {
        Throwable th;
        Throwable th2;
        while (true) {
            Object obj = this._state;
            AbstractC1229In1 abstractC1229In1 = (AbstractC1229In1) obj;
            if (Intrinsics.a(abstractC1229In1, AbstractC1229In1.f.c) ? true : Intrinsics.a(abstractC1229In1, AbstractC1229In1.a.c)) {
                C6100qE c6100qE = (C6100qE) this._closed;
                if (c6100qE == null || (th = c6100qE.a) == null) {
                    break;
                    break;
                }
                C5027l8.b(th);
                throw null;
            }
            C6100qE c6100qE2 = (C6100qE) this._closed;
            if (c6100qE2 != null && (th2 = c6100qE2.a) != null) {
                C5027l8.b(th2);
                throw null;
            }
            if (abstractC1229In1.b._availableForRead$internal == 0) {
                break;
            }
            AbstractC1229In1 abstractC1229In1C = abstractC1229In1.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1229In1C)) {
                    ByteBuffer byteBufferA = abstractC1229In1C.a();
                    x(byteBufferA, this.e, abstractC1229In1C.b._availableForRead$internal);
                    return byteBufferA;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        return null;
    }

    @Nullable
    public final ByteBuffer M() throws Throwable {
        AbstractC1229In1 abstractC1229In1D;
        JM jm = (JM) this._writeOp;
        if (jm != null) {
            throw new IllegalStateException("Write operation is already in progress: " + jm);
        }
        AbstractC1229In1.c cVarS = null;
        while (true) {
            Object obj = this._state;
            AbstractC1229In1 abstractC1229In1 = (AbstractC1229In1) obj;
            if (this.joining != null) {
                if (cVarS != null) {
                    F(cVarS);
                    return null;
                }
            } else {
                if (((C6100qE) this._closed) != null) {
                    if (cVarS != null) {
                        F(cVarS);
                    }
                    C6100qE c6100qE = (C6100qE) this._closed;
                    Intrinsics.checkNotNull(c6100qE);
                    C5027l8.b(c6100qE.a());
                    throw null;
                }
                if (abstractC1229In1 == AbstractC1229In1.a.c) {
                    if (cVarS == null) {
                        cVarS = this.c.S();
                        cVarS.b.d();
                    }
                    abstractC1229In1D = cVarS.g;
                } else if (abstractC1229In1 == AbstractC1229In1.f.c) {
                    if (cVarS != null) {
                        F(cVarS);
                    }
                    if (this.joining == null) {
                        C6100qE c6100qE2 = (C6100qE) this._closed;
                        Intrinsics.checkNotNull(c6100qE2);
                        C5027l8.b(c6100qE2.a());
                        throw null;
                    }
                } else {
                    abstractC1229In1D = abstractC1229In1.d();
                }
                AbstractC1229In1 abstractC1229In2 = abstractC1229In1D;
                AbstractC1229In1.c cVar = cVarS;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1229In2)) {
                        if (((C6100qE) this._closed) != null) {
                            I();
                            R();
                            C6100qE c6100qE3 = (C6100qE) this._closed;
                            Intrinsics.checkNotNull(c6100qE3);
                            C5027l8.b(c6100qE3.a());
                            throw null;
                        }
                        ByteBuffer byteBufferB = abstractC1229In2.b();
                        if (cVar != null) {
                            if (abstractC1229In1 == null) {
                                Intrinsics.l("old");
                                throw null;
                            }
                            if (abstractC1229In1 != AbstractC1229In1.a.c) {
                                F(cVar);
                            }
                        }
                        x(byteBufferB, this.f, abstractC1229In2.b._availableForWrite$internal);
                        return byteBufferB;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
                cVarS = cVar;
            }
            return null;
        }
    }

    public final boolean N() {
        if (this.joining != null) {
            return ((AbstractC1229In1) this._state) == AbstractC1229In1.a.c || (((AbstractC1229In1) this._state) instanceof AbstractC1229In1.b);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:3: B:59:0x00b2->B:91:?, LOOP_END, SYNTHETIC] */
    public final void O(int i, JM jm) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            AbstractC1229In1 abstractC1229In1 = (AbstractC1229In1) this._state;
            if (abstractC1229In1.b._availableForRead$internal >= i || !(this.joining == null || ((JM) this._writeOp) == null || (abstractC1229In1 != AbstractC1229In1.a.c && !(abstractC1229In1 instanceof AbstractC1229In1.b)))) {
                break;
            }
            C6100qE c6100qE = (C6100qE) this._closed;
            if (c6100qE != null) {
                Throwable th = c6100qE.a;
                if (th != null) {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    jm.resumeWith(C1795Pt1.a(th));
                    MN mn = MN.d;
                    return;
                }
                boolean zB = ((AbstractC1229In1) this._state).b.b();
                boolean z = false;
                boolean z2 = ((AbstractC1229In1) this._state).b._availableForRead$internal >= i;
                C1717Ot1.a aVar2 = C1717Ot1.e;
                if (zB && z2) {
                    z = true;
                }
                jm.resumeWith(Boolean.valueOf(z));
                MN mn2 = MN.d;
                return;
            }
            while (true) {
                if (((JM) this._readOp) != null) {
                    throw new IllegalStateException("Operation is already in progress");
                }
                if (((C6100qE) this._closed) != null) {
                    break;
                }
                AbstractC1229In1 abstractC1229In2 = (AbstractC1229In1) this._state;
                if (abstractC1229In2.b._availableForRead$internal >= i || !(this.joining == null || ((JM) this._writeOp) == null || (abstractC1229In2 != AbstractC1229In1.a.c && !(abstractC1229In2 instanceof AbstractC1229In1.b)))) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, null, jm)) {
                        if (((C6100qE) this._closed) != null) {
                            atomicReferenceFieldUpdater = l;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, jm, null)) {
                                if (atomicReferenceFieldUpdater.get(this) != jm) {
                                }
                            }
                            break;
                            break;
                        }
                        AbstractC1229In1 abstractC1229In3 = (AbstractC1229In1) this._state;
                        if (abstractC1229In3.b._availableForRead$internal >= i || (this.joining != null && ((JM) this._writeOp) != null && (abstractC1229In3 == AbstractC1229In1.a.c || (abstractC1229In3 instanceof AbstractC1229In1.b)))) {
                            atomicReferenceFieldUpdater = l;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, jm, null)) {
                                if (atomicReferenceFieldUpdater.get(this) != jm) {
                                }
                            }
                            break;
                        }
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == null);
            }
            MN mn3 = MN.d;
        }
        C1717Ot1.a aVar3 = C1717Ot1.e;
        jm.resumeWith(Boolean.TRUE);
        MN mn4 = MN.d;
    }

    public final boolean P(C4634jG0 c4634jG0) {
        if (!Q(true)) {
            return false;
        }
        v(c4634jG0);
        JM jm = (JM) l.getAndSet(this, null);
        if (jm != null) {
            C1717Ot1.a aVar = C1717Ot1.e;
            jm.resumeWith(C1795Pt1.a(new IllegalStateException("Joining is in progress")));
        }
        K();
        return true;
    }

    public final boolean Q(boolean z) {
        AbstractC1229In1.c cVar = null;
        loop0: while (true) {
            Object obj = this._state;
            AbstractC1229In1 abstractC1229In1 = (AbstractC1229In1) obj;
            C6100qE c6100qE = (C6100qE) this._closed;
            if (cVar != null) {
                if ((c6100qE != null ? c6100qE.a : null) == null) {
                    cVar.b.d();
                }
                K();
                cVar = null;
            }
            AbstractC1229In1.f fVar = AbstractC1229In1.f.c;
            if (abstractC1229In1 == fVar) {
                break;
            }
            if (abstractC1229In1 != AbstractC1229In1.a.c) {
                if (c6100qE != null && (abstractC1229In1 instanceof AbstractC1229In1.b) && (abstractC1229In1.b.e() || c6100qE.a != null)) {
                    if (c6100qE.a != null) {
                        C6660su1 c6660su1 = abstractC1229In1.b;
                        c6660su1.getClass();
                        C6660su1.c.getAndSet(c6660su1, 0);
                    }
                    cVar = ((AbstractC1229In1.b) abstractC1229In1).c;
                } else {
                    if (!z || !(abstractC1229In1 instanceof AbstractC1229In1.b) || !abstractC1229In1.b.e()) {
                        return false;
                    }
                    cVar = ((AbstractC1229In1.b) abstractC1229In1).c;
                }
            }
            AbstractC1229In1.c cVar2 = cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, fVar)) {
                    if (cVar2 == null || ((AbstractC1229In1) this._state) != AbstractC1229In1.f.c) {
                        break loop0;
                        break loop0;
                    }
                    F(cVar2);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cVar = cVar2;
        }
        return true;
    }

    public final void R() {
        if (((C6100qE) this._closed) == null || !Q(false)) {
            return;
        }
        C4634jG0 c4634jG0 = this.joining;
        if (c4634jG0 != null) {
            v(c4634jG0);
        }
        J();
        K();
    }

    @Nullable
    public final Object S(@NotNull LM frame) throws Throwable {
        if (!a0(1)) {
            C6100qE c6100qE = (C6100qE) this._closed;
            if (c6100qE == null) {
                return Unit.a;
            }
            C5027l8.b(c6100qE.a());
            throw null;
        }
        this.writeSuspensionSize = 1;
        if (this.attachedJob != null) {
            this.i.invoke(frame);
            MN mn = MN.d;
            Intrinsics.checkNotNullParameter(frame, "frame");
            return mn;
        }
        C7090uy<Unit> c7090uy = this.h;
        this.i.invoke(c7090uy);
        Object objD = c7090uy.d(C5885pC0.b(frame));
        MN mn2 = MN.d;
        if (objD == mn2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objD == mn2 ? objD : Unit.a;
    }

    public final int U(byte[] bArr, int i, int i2) throws Throwable {
        C4634jG0 c4634jG0 = this.joining;
        if (c4634jG0 != null) {
            G(this, c4634jG0);
        }
        ByteBuffer byteBufferM = M();
        int i3 = 0;
        if (byteBufferM == null) {
            return 0;
        }
        C6660su1 c6660su1 = ((AbstractC1229In1) this._state).b;
        try {
            C6100qE c6100qE = (C6100qE) this._closed;
            if (c6100qE != null) {
                C5027l8.b(c6100qE.a());
                throw null;
            }
            while (true) {
                int iG = c6660su1.g(Math.min(i2 - i3, byteBufferM.remaining()));
                if (iG == 0) {
                    s(byteBufferM, c6660su1, i3);
                    if (c6660su1.c() || this.b) {
                        w(1);
                    }
                    I();
                    R();
                    return i3;
                }
                if (iG <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBufferM.put(bArr, i + i3, iG);
                i3 += iG;
                x(byteBufferM, t(byteBufferM, this.f + i3), c6660su1._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (c6660su1.c() || this.b) {
                w(1);
            }
            I();
            R();
            throw th;
        }
    }

    public final void V(C1640Nu c1640Nu) throws Throwable {
        C4634jG0 c4634jG0 = this.joining;
        if (c4634jG0 != null) {
            G(this, c4634jG0);
        }
        ByteBuffer byteBufferM = M();
        if (byteBufferM == null) {
            return;
        }
        C6660su1 c6660su1 = ((AbstractC1229In1) this._state).b;
        try {
            C6100qE c6100qE = (C6100qE) this._closed;
            if (c6100qE != null) {
                C5027l8.b(c6100qE.a());
                throw null;
            }
            int i = 0;
            while (true) {
                int iG = c6660su1.g(Math.min(c1640Nu.c - c1640Nu.b, byteBufferM.remaining()));
                if (iG == 0) {
                    break;
                }
                C1952Ru.m(c1640Nu, byteBufferM, iG);
                i += iG;
                x(byteBufferM, t(byteBufferM, this.f + i), c6660su1._availableForWrite$internal);
            }
            s(byteBufferM, c6660su1, i);
            if (c6660su1.c() || this.b) {
                w(1);
            }
            I();
            R();
        } catch (Throwable th) {
            if (c6660su1.c() || this.b) {
                w(1);
            }
            I();
            R();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0050 -> B:24:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object W(defpackage.C2895bC r6, defpackage.LM r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C4552iw
            if (r0 == 0) goto L13
            r0 = r7
            iw r0 = (defpackage.C4552iw) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            iw r0 = new iw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L34
            r6 = 2
            if (r2 != r6) goto L2c
            defpackage.C1795Pt1.b(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            Nu r6 = r0.e
            aw r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L53
        L3c:
            defpackage.C1795Pt1.b(r7)
            r2 = r5
        L40:
            int r7 = r6.c
            int r4 = r6.b
            if (r7 <= r4) goto L5e
            r0.d = r2
            r0.e = r6
            r0.i = r3
            java.lang.Object r7 = r2.S(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            jG0 r7 = r2.joining
            if (r7 == 0) goto L5a
            G(r2, r7)
        L5a:
            r2.V(r6)
            goto L40
        L5e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2836aw.W(bC, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:26:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object X(byte[] r7, int r8, int r9, defpackage.LM r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.C4772jw
            if (r0 == 0) goto L13
            r0 = r10
            jw r0 = (defpackage.C4772jw) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            jw r0 = new jw
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.i
            MN r1 = defpackage.MN.d
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r7 = r0.h
            int r8 = r0.g
            byte[] r9 = r0.e
            aw r2 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L65
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.C1795Pt1.b(r10)
            r2 = r6
        L3b:
            if (r9 <= 0) goto L71
            r0.d = r2
            r0.e = r7
            r0.g = r8
            r0.h = r9
            r0.k = r3
            jG0 r10 = r2.joining
            if (r10 == 0) goto L4e
            G(r2, r10)
        L4e:
            int r10 = r2.U(r7, r8, r9)
            if (r10 <= 0) goto L5b
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r10 = r4
            goto L5f
        L5b:
            java.lang.Object r10 = r2.Z(r7, r8, r9, r0)
        L5f:
            if (r10 != r1) goto L62
            return r1
        L62:
            r5 = r9
            r9 = r7
            r7 = r5
        L65:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r8 = r8 + r10
            int r7 = r7 - r10
            r5 = r9
            r9 = r7
            r7 = r5
            goto L3b
        L71:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2836aw.X(byte[], int, int, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(int i, LM lm) throws Throwable {
        C5192lw frame;
        C2836aw c2836aw;
        if (lm instanceof C5192lw) {
            frame = (C5192lw) lm;
            int i2 = frame.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                frame.i = i2 - Integer.MIN_VALUE;
            } else {
                frame = new C5192lw(this, lm);
            }
        } else {
            frame = new C5192lw(this, lm);
        }
        Object obj = frame.g;
        MN mn = MN.d;
        int i3 = frame.i;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            c2836aw = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = frame.e;
            c2836aw = frame.d;
            C1795Pt1.b(obj);
        }
        while (c2836aw.a0(i)) {
            frame.d = c2836aw;
            frame.e = i;
            frame.i = 1;
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            while (true) {
                C6100qE c6100qE = (C6100qE) c2836aw._closed;
                if (c6100qE != null) {
                    C5027l8.b(c6100qE.a());
                    throw null;
                }
                if (!c2836aw.a0(i)) {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    c6251qy.resumeWith(Unit.a);
                    break;
                }
                while (true) {
                    if (((JM) c2836aw._writeOp) != null) {
                        throw new IllegalStateException("Operation is already in progress");
                    }
                    if (!c2836aw.a0(i)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c2836aw, null, c6251qy)) {
                            if (!c2836aw.a0(i)) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                                while (!atomicReferenceFieldUpdater2.compareAndSet(c2836aw, c6251qy, null)) {
                                    if (atomicReferenceFieldUpdater2.get(c2836aw) != c6251qy) {
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(c2836aw) == null);
                }
            }
            c2836aw.w(i);
            if (c2836aw.N()) {
                c2836aw.J();
            }
            Object objQ = c6251qy.q();
            if (objQ == MN.d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ == mn) {
                return mn;
            }
        }
        C6100qE c6100qE2 = (C6100qE) c2836aw._closed;
        if (c6100qE2 == null) {
            return Unit.a;
        }
        C5027l8.b(c6100qE2.a());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:22:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Z(byte[] r6, int r7, int r8, defpackage.LM r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.C4982kw
            if (r0 == 0) goto L13
            r0 = r9
            kw r0 = (defpackage.C4982kw) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            kw r0 = new kw
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.i
            MN r1 = defpackage.MN.d
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 == r3) goto L32
            r6 = 2
            if (r2 != r6) goto L2a
            defpackage.C1795Pt1.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.h
            int r7 = r0.g
            byte[] r8 = r0.e
            aw r2 = r0.d
            defpackage.C1795Pt1.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L56
        L41:
            defpackage.C1795Pt1.b(r9)
            r2 = r5
        L45:
            r0.d = r2
            r0.e = r6
            r0.g = r7
            r0.h = r8
            r0.k = r3
            java.lang.Object r9 = r2.S(r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            jG0 r9 = r2.joining
            if (r9 == 0) goto L5d
            G(r2, r9)
        L5d:
            int r9 = r2.U(r6, r7, r8)
            if (r9 <= 0) goto L45
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2836aw.Z(byte[], int, int, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1958Rw
    public final boolean a(@Nullable Throwable th) {
        C4634jG0 c4634jG0;
        if (((C6100qE) this._closed) == null) {
            C6100qE c6100qE = th == null ? C6100qE.b : new C6100qE(th);
            ((AbstractC1229In1) this._state).b.b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c6100qE)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            ((AbstractC1229In1) this._state).b.b();
            C6660su1 c6660su1 = ((AbstractC1229In1) this._state).b;
            if (c6660su1._availableForWrite$internal == c6660su1.a || th != null) {
                R();
            }
            JM jm = (JM) l.getAndSet(this, null);
            if (jm != null) {
                if (th != null) {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    jm.resumeWith(C1795Pt1.a(th));
                } else {
                    Boolean boolValueOf = Boolean.valueOf(((AbstractC1229In1) this._state).b._availableForRead$internal > 0);
                    C1717Ot1.a aVar2 = C1717Ot1.e;
                    jm.resumeWith(boolValueOf);
                }
            }
            JM jm2 = (JM) m.getAndSet(this, null);
            if (jm2 != null) {
                C1717Ot1.a aVar3 = C1717Ot1.e;
                jm2.resumeWith(C1795Pt1.a(th == null ? new C7149vE("Byte channel was closed") : th));
            }
            if (((AbstractC1229In1) this._state) == AbstractC1229In1.f.c && (c4634jG0 = this.joining) != null) {
                v(c4634jG0);
            }
            if (th != null) {
                XF0 xf0 = this.attachedJob;
                if (xf0 != null) {
                    xf0.l(null);
                }
                this.g.c(th);
                this.h.c(th);
                return true;
            }
            this.h.c(new C7149vE("Byte channel was closed"));
            C7090uy<Boolean> c7090uy = this.g;
            Boolean value = Boolean.valueOf(((AbstractC1229In1) this._state).b.b());
            c7090uy.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            C1717Ot1.a aVar4 = C1717Ot1.e;
            c7090uy.resumeWith(value);
            C7090uy.a aVar5 = (C7090uy.a) C7090uy.e.getAndSet(c7090uy, null);
            if (aVar5 != null) {
                aVar5.a();
            }
            return true;
        }
        return false;
    }

    public final boolean a0(int i) {
        C4634jG0 c4634jG0 = this.joining;
        AbstractC1229In1 abstractC1229In1 = (AbstractC1229In1) this._state;
        if (((C6100qE) this._closed) != null) {
            return false;
        }
        if (c4634jG0 == null) {
            return abstractC1229In1.b._availableForWrite$internal < i && abstractC1229In1 != AbstractC1229In1.a.c;
        }
        return (abstractC1229In1 == AbstractC1229In1.f.c || (abstractC1229In1 instanceof AbstractC1229In1.g) || (abstractC1229In1 instanceof AbstractC1229In1.e)) ? false : true;
    }

    @Override // defpackage.InterfaceC0942Ew
    @Nullable
    public final Throwable b() {
        C6100qE c6100qE = (C6100qE) this._closed;
        if (c6100qE != null) {
            return c6100qE.a;
        }
        return null;
    }

    @Override // defpackage.InterfaceC1958Rw
    @Nullable
    public final Object c(@NotNull E81.a aVar, @NotNull E81 e81) {
        return T(this, 1, aVar, e81);
    }

    @Override // defpackage.InterfaceC0942Ew
    public final int d() {
        return ((AbstractC1229In1) this._state).b._availableForRead$internal;
    }

    @Override // defpackage.InterfaceC0942Ew
    @Nullable
    public final Object e(@NotNull C2895bC c2895bC, @NotNull LM lm) throws Throwable {
        int iZ = z(this, c2895bC);
        if (iZ == 0 && ((C6100qE) this._closed) != null) {
            iZ = ((AbstractC1229In1) this._state).b.b() ? z(this, c2895bC) : -1;
        } else if (iZ <= 0 && c2895bC.e > c2895bC.c) {
            return A(c2895bC, lm);
        }
        return new Integer(iZ);
    }

    @Override // defpackage.InterfaceC0942Ew
    @Nullable
    public final Object f(long j2, @NotNull LM lm) throws Throwable {
        if (!(((C6100qE) this._closed) != null)) {
            return C(j2, lm);
        }
        Throwable thB = b();
        if (thB != null) {
            C5027l8.b(thB);
            throw null;
        }
        C0864Dw c0864Dw = new C0864Dw(null);
        try {
            C2895bC c2895bCN = C5189lv.n(c0864Dw, 1, null);
            while (true) {
                try {
                    if (c2895bCN.e - c2895bCN.c > j2) {
                        int i = c2895bCN.d;
                        c2895bCN.b = i;
                        c2895bCN.c = i;
                        c2895bCN.e = (int) j2;
                    }
                    j2 -= (long) z(this, c2895bCN);
                    if (j2 <= 0 || k()) {
                        break;
                    }
                    c2895bCN = C5189lv.n(c0864Dw, 1, c2895bCN);
                } catch (Throwable th) {
                    c0864Dw.c();
                    throw th;
                }
            }
            c0864Dw.c();
            return c0864Dw.t();
        } catch (Throwable th2) {
            c0864Dw.close();
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC1958Rw
    public final void flush() {
        w(1);
    }

    @Override // defpackage.InterfaceC1958Rw
    @Nullable
    public final Object g(@NotNull byte[] bArr, int i, @NotNull LM lm) throws Throwable {
        C4634jG0 c4634jG0 = this.joining;
        if (c4634jG0 != null) {
            G(this, c4634jG0);
        }
        int i2 = 0;
        while (i > 0) {
            int iU = U(bArr, i2, i);
            if (iU == 0) {
                break;
            }
            i2 += iU;
            i -= iU;
        }
        if (i == 0) {
            return Unit.a;
        }
        Object objX = X(bArr, i2, i, lm);
        return objX == MN.d ? objX : Unit.a;
    }

    @Override // defpackage.InterfaceC1958Rw
    @Nullable
    public final Object h(@NotNull C2895bC c2895bC, @NotNull JM jm) throws Throwable {
        V(c2895bC);
        if (c2895bC.c <= c2895bC.b) {
            return Unit.a;
        }
        Object objW = W(c2895bC, (LM) jm);
        return objW == MN.d ? objW : Unit.a;
    }

    @Override // defpackage.InterfaceC0942Ew
    public final boolean i(@Nullable Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel has been cancelled");
        }
        return a(th);
    }

    @Override // defpackage.InterfaceC0942Ew
    @Nullable
    public final Object j(@NotNull byte[] bArr, int i, int i2, @NotNull LM lm) throws Throwable {
        int iY = y(bArr, i, i2);
        if (iY == 0 && ((C6100qE) this._closed) != null) {
            iY = ((AbstractC1229In1) this._state).b.b() ? y(bArr, i, i2) : -1;
        } else if (iY <= 0 && i2 != 0) {
            return B(bArr, i, i2, lm);
        }
        return new Integer(iY);
    }

    @Override // defpackage.InterfaceC0942Ew
    public final boolean k() {
        return ((AbstractC1229In1) this._state) == AbstractC1229In1.f.c && ((C6100qE) this._closed) != null;
    }

    @Override // defpackage.InterfaceC1958Rw
    public final boolean l() {
        return this.b;
    }

    public final void p(@NotNull XF0 job) {
        Intrinsics.checkNotNullParameter(job, "job");
        XF0 xf0 = this.attachedJob;
        if (xf0 != null) {
            xf0.l(null);
        }
        this.attachedJob = job;
        job.A(true, true, new a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(int i, Function1 function1, LM lm) {
        C3046bw c3046bw;
        C2836aw c2836aw;
        if (lm instanceof C3046bw) {
            c3046bw = (C3046bw) lm;
            int i2 = c3046bw.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3046bw.i = i2 - Integer.MIN_VALUE;
            } else {
                c3046bw = new C3046bw(this, lm);
            }
        } else {
            c3046bw = new C3046bw(this, lm);
        }
        Object obj = c3046bw.g;
        MN mn = MN.d;
        int i3 = c3046bw.i;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            c3046bw.d = this;
            c3046bw.e = function1;
            c3046bw.i = 1;
            if (Y(i, c3046bw) == mn) {
                return mn;
            }
            c2836aw = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return Unit.a;
            }
            c2836aw = c3046bw.d;
            C1795Pt1.b(obj);
        }
        C4634jG0 c4634jG0 = c2836aw.joining;
        if (c4634jG0 != null) {
            G(c2836aw, c4634jG0);
        }
        return Unit.a;
    }

    public final void r(ByteBuffer byteBuffer, C6660su1 c6660su1, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.e = t(byteBuffer, this.e + i);
        c6660su1.a(i);
        this.totalBytesRead += (long) i;
        K();
    }

    public final void s(ByteBuffer byteBuffer, C6660su1 c6660su1, int i) {
        int i2;
        int i3;
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f = t(byteBuffer, this.f + i);
        do {
            i2 = c6660su1._pendingToFlush;
            i3 = i2 + i;
            if (i3 > c6660su1.a) {
                throw new IllegalArgumentException("Complete write overflow: " + i2 + " + " + i + " > " + c6660su1.a);
            }
        } while (!C6660su1.d.compareAndSet(c6660su1, i2, i3));
        this.totalBytesWritten += (long) i;
    }

    public final int t(ByteBuffer byteBuffer, int i) {
        int iCapacity = byteBuffer.capacity();
        int i2 = this.d;
        return i >= iCapacity - i2 ? i - (byteBuffer.capacity() - i2) : i;
    }

    @NotNull
    public final String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + ((AbstractC1229In1) this._state) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02b7 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #4 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:142:0x02b7, B:145:0x02bf, B:147:0x02cb, B:149:0x02d2, B:151:0x02d8, B:153:0x02e2, B:157:0x030e, B:160:0x0318, B:170:0x0333, B:172:0x0337, B:164:0x0321, B:47:0x00dc, B:182:0x036e, B:184:0x0374, B:188:0x037e, B:189:0x0386, B:190:0x038c, B:186:0x0378, B:192:0x038f, B:193:0x0393, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02bf A[Catch: all -> 0x0047, TryCatch #4 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:142:0x02b7, B:145:0x02bf, B:147:0x02cb, B:149:0x02d2, B:151:0x02d8, B:153:0x02e2, B:157:0x030e, B:160:0x0318, B:170:0x0333, B:172:0x0337, B:164:0x0321, B:47:0x00dc, B:182:0x036e, B:184:0x0374, B:188:0x037e, B:189:0x0386, B:190:0x038c, B:186:0x0378, B:192:0x038f, B:193:0x0393, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02cb A[Catch: all -> 0x0047, TryCatch #4 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:142:0x02b7, B:145:0x02bf, B:147:0x02cb, B:149:0x02d2, B:151:0x02d8, B:153:0x02e2, B:157:0x030e, B:160:0x0318, B:170:0x0333, B:172:0x0337, B:164:0x0321, B:47:0x00dc, B:182:0x036e, B:184:0x0374, B:188:0x037e, B:189:0x0386, B:190:0x038c, B:186:0x0378, B:192:0x038f, B:193:0x0393, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0328  */
    /* JADX WARN: Code duplicated, block: B:172:0x0337 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #4 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:142:0x02b7, B:145:0x02bf, B:147:0x02cb, B:149:0x02d2, B:151:0x02d8, B:153:0x02e2, B:157:0x030e, B:160:0x0318, B:170:0x0333, B:172:0x0337, B:164:0x0321, B:47:0x00dc, B:182:0x036e, B:184:0x0374, B:188:0x037e, B:189:0x0386, B:190:0x038c, B:186:0x0378, B:192:0x038f, B:193:0x0393, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x038f A[Catch: all -> 0x0047, TryCatch #4 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:142:0x02b7, B:145:0x02bf, B:147:0x02cb, B:149:0x02d2, B:151:0x02d8, B:153:0x02e2, B:157:0x030e, B:160:0x0318, B:170:0x0333, B:172:0x0337, B:164:0x0321, B:47:0x00dc, B:182:0x036e, B:184:0x0374, B:188:0x037e, B:189:0x0386, B:190:0x038c, B:186:0x0378, B:192:0x038f, B:193:0x0393, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd A[Catch: all -> 0x0047, TryCatch #4 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:142:0x02b7, B:145:0x02bf, B:147:0x02cb, B:149:0x02d2, B:151:0x02d8, B:153:0x02e2, B:157:0x030e, B:160:0x0318, B:170:0x0333, B:172:0x0337, B:164:0x0321, B:47:0x00dc, B:182:0x036e, B:184:0x0374, B:188:0x037e, B:189:0x0386, B:190:0x038c, B:186:0x0378, B:192:0x038f, B:193:0x0393, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1 A[Catch: all -> 0x0047, TryCatch #4 {all -> 0x0047, blocks: (B:14:0x0039, B:39:0x00c7, B:41:0x00cd, B:43:0x00d1, B:44:0x00d4, B:142:0x02b7, B:145:0x02bf, B:147:0x02cb, B:149:0x02d2, B:151:0x02d8, B:153:0x02e2, B:157:0x030e, B:160:0x0318, B:170:0x0333, B:172:0x0337, B:164:0x0321, B:47:0x00dc, B:182:0x036e, B:184:0x0374, B:188:0x037e, B:189:0x0386, B:190:0x038c, B:186:0x0378, B:192:0x038f, B:193:0x0393, B:21:0x005e), top: B:207:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Path cross not found for [B:142:0x02b7, B:149:0x02d2], limit reached: 224 */
    /* JADX WARN: Path cross not found for [B:149:0x02d2, B:142:0x02b7], limit reached: 224 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x02cb -> B:148:0x02ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x0335 -> B:148:0x02ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x0357 -> B:148:0x02ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object u(@org.jetbrains.annotations.NotNull defpackage.C2836aw r28, long r29, @org.jetbrains.annotations.NotNull defpackage.LM r31) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2836aw.u(aw, long, LM):java.lang.Object");
    }

    public final void v(C4634jG0 c4634jG0) {
        if (((C6100qE) this._closed) == null) {
            return;
        }
        this.joining = null;
        c4634jG0.getClass();
        throw null;
    }

    public final void w(int i) {
        AbstractC1229In1 abstractC1229In1;
        AbstractC1229In1.f fVar;
        do {
            abstractC1229In1 = (AbstractC1229In1) this._state;
            fVar = AbstractC1229In1.f.c;
            if (abstractC1229In1 == fVar) {
                return;
            } else {
                abstractC1229In1.b.b();
            }
        } while (abstractC1229In1 != ((AbstractC1229In1) this._state));
        int i2 = abstractC1229In1.b._availableForWrite$internal;
        if (abstractC1229In1.b._availableForRead$internal >= 1) {
            J();
        }
        C4634jG0 c4634jG0 = this.joining;
        if (i2 >= i) {
            if (c4634jG0 == null || ((AbstractC1229In1) this._state) == fVar) {
                K();
            }
        }
    }

    public final void x(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iCapacity = byteBuffer.capacity() - this.d;
        int i3 = i2 + i;
        if (i3 <= iCapacity) {
            iCapacity = i3;
        }
        byteBuffer.limit(iCapacity);
        byteBuffer.position(i);
    }

    public final int y(byte[] bArr, int i, int i2) throws Throwable {
        ByteBuffer byteBufferL = L();
        int i3 = 0;
        if (byteBufferL == null) {
            return 0;
        }
        C6660su1 c6660su1 = ((AbstractC1229In1) this._state).b;
        try {
            if (c6660su1._availableForRead$internal != 0) {
                int iCapacity = byteBufferL.capacity() - this.d;
                while (true) {
                    int i4 = i2 - i3;
                    if (i4 == 0) {
                        break;
                    }
                    int i5 = this.e;
                    int iF = c6660su1.f(Math.min(iCapacity - i5, i4));
                    if (iF == 0) {
                        break;
                    }
                    byteBufferL.limit(i5 + iF);
                    byteBufferL.position(i5);
                    byteBufferL.get(bArr, i + i3, iF);
                    r(byteBufferL, c6660su1, iF);
                    i3 += iF;
                }
            }
            return i3;
        } finally {
            H();
            R();
        }
    }

    public C2836aw(boolean z, @NotNull O71<AbstractC1229In1.c> pool, int i) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.b = z;
        this.c = pool;
        this.d = i;
        this._state = AbstractC1229In1.a.c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        Intrinsics.checkNotNullParameter(this, "channel");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2895bC.i;
        Intrinsics.checkNotNullParameter(this, "channel");
        C4634jG0 c4634jG0 = this.joining;
        if (c4634jG0 != null) {
            G(this, c4634jG0);
        }
        C2895bC.l.getClass();
        C6660su1 c6660su1 = ((AbstractC1229In1) this._state).b;
        this.g = new C7090uy<>();
        this.h = new C7090uy<>();
        this.i = new b();
    }
}
