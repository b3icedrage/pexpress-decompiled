package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3253cv0 extends InterfaceC0775Cs0<InterfaceC3044bv0> {
    void addEmailSubscription(@NotNull String str);

    void addOrUpdatePushSubscriptionToken(@Nullable String str, @NotNull GU1 gu1);

    void addSmsSubscription(@NotNull String str);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ boolean getHasSubscribers();

    @NotNull
    AU1 getPushSubscriptionModel();

    @NotNull
    C7830yU1 getSubscriptions();

    void removeEmailSubscription(@NotNull String str);

    void removeSmsSubscription(@NotNull String str);

    void setSubscriptions(@NotNull C7830yU1 c7830yU1);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void subscribe(InterfaceC3044bv0 interfaceC3044bv0);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void unsubscribe(InterfaceC3044bv0 interfaceC3044bv0);
}
