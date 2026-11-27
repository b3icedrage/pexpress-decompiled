package defpackage;

import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AA0 extends InputStream {

    @NotNull
    public final InterfaceC0942Ew d;

    @NotNull
    public final C2684aG0 e;

    @NotNull
    public final a g;

    @Nullable
    public byte[] h;

    public static final class a extends AbstractC3455dt {
        public final /* synthetic */ AA0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(XF0 xf0, AA0 aa0) {
            super(xf0);
            this.g = aa0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.AbstractC3455dt
        @Nullable
        public final Object a(@NotNull LM lm) {
            C7979zA0 frame;
            int iIntValue;
            a aVar;
            Object obj;
            JM jmB;
            if (lm instanceof C7979zA0) {
                frame = (C7979zA0) lm;
                int i = frame.h;
                if ((i & Integer.MIN_VALUE) != 0) {
                    frame.h = i - Integer.MIN_VALUE;
                } else {
                    frame = new C7979zA0(this, lm);
                }
            } else {
                frame = new C7979zA0(this, lm);
            }
            Object objJ = frame.e;
            MN mn = MN.d;
            int i2 = frame.h;
            Object obj2 = null;
            if (i2 != 0) {
                if (i2 == 1) {
                    aVar = frame.d;
                    C1795Pt1.b(objJ);
                    Intrinsics.c(objJ, "null cannot be cast to non-null type kotlin.ByteArray");
                    InterfaceC0942Ew interfaceC0942Ew = aVar.g.d;
                    int i3 = aVar.d;
                    int i4 = aVar.e;
                    frame.d = aVar;
                    frame.h = 2;
                    objJ = interfaceC0942Ew.j((byte[]) objJ, i3, i4, frame);
                    if (objJ == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = frame.d;
                    C1795Pt1.b(objJ);
                }
                iIntValue = ((Number) objJ).intValue();
                if (iIntValue == -1) {
                    aVar.g.e.X();
                    aVar.result = iIntValue;
                    return Unit.a;
                }
            } else {
                C1795Pt1.b(objJ);
                iIntValue = 0;
                aVar = this;
            }
            aVar.result = iIntValue;
            frame.d = aVar;
            frame.h = 1;
            while (true) {
                Object obj3 = aVar.state;
                if (obj3 instanceof Thread) {
                    jmB = C5885pC0.b(frame);
                    obj = obj3;
                } else {
                    if (!Intrinsics.a(obj3, aVar)) {
                        throw new IllegalStateException("Already suspended or in finished state");
                    }
                    obj = obj2;
                    jmB = C5885pC0.b(frame);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC3455dt.f;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj3, jmB)) {
                        if (obj != null) {
                            InterfaceC3815fc1 interfaceC3815fc1 = C7027uf1.a.get();
                            if (interfaceC3815fc1 == null) {
                                interfaceC3815fc1 = FV.a;
                            }
                            interfaceC3815fc1.b(obj);
                        }
                        MN mn2 = MN.d;
                        Intrinsics.checkNotNullParameter(frame, "frame");
                        return mn;
                    }
                } while (atomicReferenceFieldUpdater.get(aVar) == obj3);
                obj2 = obj;
            }
        }
    }

    public AA0(@Nullable XF0 xf0, @NotNull InterfaceC0942Ew channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.d = channel;
        this.e = new C2684aG0(xf0);
        this.g = new a(xf0, this);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.d.d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            super.close();
            InterfaceC0942Ew interfaceC0942Ew = this.d;
            Intrinsics.checkNotNullParameter(interfaceC0942Ew, "<this>");
            interfaceC0942Ew.i(null);
            if (!this.e.S0()) {
                this.e.l(null);
            }
            a aVar = this.g;
            A20 a20 = aVar.c;
            if (a20 != null) {
                a20.b();
            }
            AbstractC3455dt.c cVar = aVar.b;
            C1717Ot1.a aVar2 = C1717Ot1.e;
            cVar.resumeWith(C1795Pt1.a(new CancellationException("Stream closed")));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            byte[] bArr = this.h;
            if (bArr == null) {
                bArr = new byte[1];
                this.h = bArr;
            }
            int iB = this.g.b(bArr, 0, 1);
            if (iB == -1) {
                return -1;
            }
            if (iB == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + iB + " bytes.").toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(@Nullable byte[] bArr, int i, int i2) {
        a aVar;
        aVar = this.g;
        Intrinsics.checkNotNull(bArr);
        return aVar.b(bArr, i, i2);
    }
}
