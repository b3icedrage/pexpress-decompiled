package defpackage;

import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6038px implements InterfaceC5828ox {

    @NotNull
    public final LinkedList<SZ1> a;

    @NotNull
    public final LinkedList b;

    public C6038px() {
        LinkedList<SZ1> linkedList = new LinkedList<>();
        this.a = linkedList;
        this.b = linkedList;
    }

    @Override // defpackage.InterfaceC5828ox
    @NotNull
    public final LinkedList a() {
        return this.b;
    }
}
