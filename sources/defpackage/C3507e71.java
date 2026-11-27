package defpackage;

import android.location.Location;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Le71;", "Ljt0;", "<init>", "()V", "", "start", "(LJM;)Ljava/lang/Object;", "", "stop", "Landroid/location/Location;", "getLastLocation", "()Landroid/location/Location;", "Lnt0;", "handler", "subscribe", "(Lnt0;)V", "unsubscribe", "getHasSubscribers", "()Z", "hasSubscribers", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3507e71 implements InterfaceC4764jt0 {
    @Override // defpackage.InterfaceC4764jt0, defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Location getLastLocation() {
        return null;
    }

    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Object start(@NotNull JM<? super Boolean> jm) {
        return Boolean.FALSE;
    }

    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Object stop(@NotNull JM<? super Unit> jm) {
        return Unit.a;
    }

    @Override // defpackage.InterfaceC4764jt0, defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC5607nt0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // defpackage.InterfaceC4764jt0, defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC5607nt0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
