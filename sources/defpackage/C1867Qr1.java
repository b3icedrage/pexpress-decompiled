package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1867Qr1<T> implements WN<T> {

    @NotNull
    public final C6178qd a;

    public C1867Qr1(@NotNull C6178qd produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.a = produceNewData;
    }

    @Override // defpackage.WN
    @Nullable
    public final Object a(@NotNull VN vn) {
        return this.a.invoke(vn);
    }
}
