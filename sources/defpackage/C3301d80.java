package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3301d80 {

    @NotNull
    public final EnumC4608j80 a;

    @NotNull
    public final Object b;

    @NotNull
    public final ArrayBlockingQueue<C3091c80> c;

    public C3301d80(@NotNull EnumC4608j80 channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.a = channel;
        this.b = new Object();
        this.c = new ArrayBlockingQueue<>(UserVerificationMethods.USER_VERIFY_NONE);
    }
}
