package kotlin.ranges;

import defpackage.C1952Ru;
import defpackage.C6297rA;
import defpackage.InterfaceC6745tJ0;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Iterable<Character>, InterfaceC6745tJ0 {

    @NotNull
    public static final C0431a h = new C0431a(null);
    public final char d;
    public final char e;
    public final int g = 1;

    /* JADX INFO: renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C0431a {
        public C0431a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public a(char c, char c2) {
        this.d = c;
        this.e = (char) C1952Ru.k(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new C6297rA(this.d, this.e, this.g);
    }
}
