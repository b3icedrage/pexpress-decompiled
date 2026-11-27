package defpackage;

import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7701xr0<ResponseT, ReturnT> extends AbstractC6323rI1<ReturnT> {
    public final C0698Bs1 a;
    public final InterfaceC1023Fx.a b;
    public final WM<AbstractC1091Gt1, ResponseT> c;

    /* JADX INFO: renamed from: xr0$a */
    public static final class a<ResponseT, ReturnT> extends AbstractC7701xr0<ResponseT, ReturnT> {
        public final InterfaceC1179Hx<ResponseT, ReturnT> d;

        public a(C0698Bs1 c0698Bs1, InterfaceC1023Fx.a aVar, WM<AbstractC1091Gt1, ResponseT> wm, InterfaceC1179Hx<ResponseT, ReturnT> interfaceC1179Hx) {
            super(c0698Bs1, aVar, wm);
            this.d = interfaceC1179Hx;
        }

        @Override // defpackage.AbstractC7701xr0
        public final Object c(C6291r81 c6291r81, Object[] objArr) {
            return this.d.b(c6291r81);
        }
    }

    /* JADX INFO: renamed from: xr0$b */
    public static final class b<ResponseT> extends AbstractC7701xr0<ResponseT, Object> {
        public final InterfaceC1179Hx<ResponseT, InterfaceC1101Gx<ResponseT>> d;

        public b(C0698Bs1 c0698Bs1, InterfaceC1023Fx.a aVar, WM wm, InterfaceC1179Hx interfaceC1179Hx) {
            super(c0698Bs1, aVar, wm);
            this.d = interfaceC1179Hx;
        }

        @Override // defpackage.AbstractC7701xr0
        public final Object c(C6291r81 c6291r81, Object[] objArr) {
            InterfaceC1101Gx interfaceC1101Gx = (InterfaceC1101Gx) this.d.b(c6291r81);
            JM frame = (JM) objArr[objArr.length - 1];
            try {
                C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
                c6251qy.u(new VK0(interfaceC1101Gx, 0));
                interfaceC1101Gx.D(new WK0(c6251qy));
                Object objQ = c6251qy.q();
                if (objQ == MN.d) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return objQ;
            } catch (Exception e) {
                return ZK0.a(e, frame);
            }
        }
    }

    /* JADX INFO: renamed from: xr0$c */
    public static final class c<ResponseT> extends AbstractC7701xr0<ResponseT, Object> {
        public final InterfaceC1179Hx<ResponseT, InterfaceC1101Gx<ResponseT>> d;

        public c(C0698Bs1 c0698Bs1, InterfaceC1023Fx.a aVar, WM<AbstractC1091Gt1, ResponseT> wm, InterfaceC1179Hx<ResponseT, InterfaceC1101Gx<ResponseT>> interfaceC1179Hx) {
            super(c0698Bs1, aVar, wm);
            this.d = interfaceC1179Hx;
        }

        @Override // defpackage.AbstractC7701xr0
        public final Object c(C6291r81 c6291r81, Object[] objArr) {
            InterfaceC1101Gx interfaceC1101Gx = (InterfaceC1101Gx) this.d.b(c6291r81);
            JM frame = (JM) objArr[objArr.length - 1];
            try {
                C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
                c6251qy.u(new XK0(interfaceC1101Gx, 0));
                interfaceC1101Gx.D(new YK0(c6251qy));
                Object objQ = c6251qy.q();
                if (objQ == MN.d) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return objQ;
            } catch (Exception e) {
                return ZK0.a(e, frame);
            }
        }
    }

    public AbstractC7701xr0(C0698Bs1 c0698Bs1, InterfaceC1023Fx.a aVar, WM<AbstractC1091Gt1, ResponseT> wm) {
        this.a = c0698Bs1;
        this.b = aVar;
        this.c = wm;
    }

    @Override // defpackage.AbstractC6323rI1
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new C6291r81(this.a, objArr, this.b, this.c), objArr);
    }

    @Nullable
    public abstract Object c(C6291r81 c6291r81, Object[] objArr);
}
