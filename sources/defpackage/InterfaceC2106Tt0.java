package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2106Tt0 extends InterfaceC0775Cs0<InterfaceC2028St0> {
    boolean getCanRequestPermission();

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ boolean getHasSubscribers();

    @Nullable
    Object prompt(boolean z, @NotNull JM<? super Boolean> jm);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void subscribe(InterfaceC2028St0 interfaceC2028St0);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void unsubscribe(InterfaceC2028St0 interfaceC2028St0);
}
