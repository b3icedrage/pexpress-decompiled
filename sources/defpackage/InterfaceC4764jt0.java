package defpackage;

import android.location.Location;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4764jt0 extends InterfaceC0775Cs0<InterfaceC5607nt0> {
    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ boolean getHasSubscribers();

    @Nullable
    Location getLastLocation();

    @Nullable
    Object start(@NotNull JM<? super Boolean> jm);

    @Nullable
    Object stop(@NotNull JM<? super Unit> jm);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void subscribe(InterfaceC5607nt0 interfaceC5607nt0);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void unsubscribe(InterfaceC5607nt0 interfaceC5607nt0);
}
