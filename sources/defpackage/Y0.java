package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Y0 implements InterfaceC1232Io1 {
    public final Object a;
    public final Object b;

    public Y0() {
        this.a = new CopyOnWriteArraySet();
        this.b = new CopyOnWriteArraySet();
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public void d(@NotNull String str) {
        ((CopyOnWriteArraySet) this.a).add(str);
        ((CopyOnWriteArraySet) this.b).remove(str);
    }

    public void e(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    public void f(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    public abstract void g();

    @Override // defpackage.InterfaceC1232Io1
    @NotNull
    public AbstractC4649jL0 getType() {
        AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) this.a;
        if (abstractC4649jL0 != null) {
            return abstractC4649jL0;
        }
        c(1);
        throw null;
    }

    public Y0(@NotNull AbstractC4649jL0 abstractC4649jL0, @Nullable InterfaceC1232Io1 interfaceC1232Io1) {
        if (abstractC4649jL0 != null) {
            this.a = abstractC4649jL0;
            this.b = interfaceC1232Io1 == null ? this : interfaceC1232Io1;
        } else {
            c(0);
            throw null;
        }
    }
}
