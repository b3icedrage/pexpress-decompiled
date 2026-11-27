package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ll1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lll1;", "Luu0;", "Lvu0;", "<init>", "()V", "Luu0$a;", "registerForPush", "(LJM;)Ljava/lang/Object;", "", "id", "", "fireCallback", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5159ll1 implements InterfaceC7079uu0, InterfaceC7289vu0 {
    @Override // defpackage.InterfaceC7289vu0
    @Nullable
    public Object fireCallback(@Nullable String str, @NotNull JM<? super Unit> jm) {
        return Unit.a;
    }

    @Override // defpackage.InterfaceC7079uu0
    @Nullable
    public Object registerForPush(@NotNull JM<? super InterfaceC7079uu0.a> jm) {
        return new InterfaceC7079uu0.a(null, GU1.ERROR);
    }
}
