package defpackage;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4980kv0 extends InterfaceC0775Cs0<InterfaceC5190lv0> {
    boolean evaluateMessageTriggers(@NotNull C1881Qw0 c1881Qw0);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ boolean getHasSubscribers();

    boolean isTriggerOnMessage(@NotNull C1881Qw0 c1881Qw0, @NotNull Collection<String> collection);

    boolean messageHasOnlyDynamicTriggers(@NotNull C1881Qw0 c1881Qw0);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void subscribe(InterfaceC5190lv0 interfaceC5190lv0);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void unsubscribe(InterfaceC5190lv0 interfaceC5190lv0);
}
