package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: s60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6492s60 implements Sequence, InterfaceC3494e40 {

    @NotNull
    public static final C6492s60 a = new C6492s60();

    @Override // defpackage.InterfaceC3494e40
    public final Sequence a(int i) {
        return a;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator iterator() {
        return C5443n60.d;
    }
}
