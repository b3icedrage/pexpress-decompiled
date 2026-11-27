package defpackage;

import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7957z42 implements InterfaceC4819k81 {

    @Nullable
    public LiveData a;
    public final /* synthetic */ InterfaceC1608Nj0 b;
    public final /* synthetic */ EY0 c;

    /* JADX INFO: renamed from: z42$a */
    public static final class a extends ML0 implements Function1 {
        public final /* synthetic */ EY0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EY0 ey0) {
            super(1);
            this.d = ey0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.d.k(obj);
            return Unit.a;
        }
    }

    public C7957z42(InterfaceC1608Nj0 interfaceC1608Nj0, EY0 ey0) {
        this.b = interfaceC1608Nj0;
        this.c = ey0;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(Object obj) {
        LiveData liveData = (LiveData) this.b.apply(obj);
        LiveData liveData2 = this.a;
        if (liveData2 == liveData) {
            return;
        }
        EY0 ey0 = this.c;
        if (liveData2 != null) {
            Intrinsics.checkNotNull(liveData2);
            ey0.m(liveData2);
        }
        this.a = liveData;
        if (liveData != null) {
            Intrinsics.checkNotNull(liveData);
            ey0.l(liveData, new C7747y42.a(new a(ey0)));
        }
    }
}
