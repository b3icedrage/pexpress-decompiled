package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B1 extends AbstractC4834kD {

    @NotNull
    public final I51<a> b;

    public static final class a {

        @NotNull
        public final Collection<AbstractC4649jL0> a;

        @NotNull
        public List<? extends AbstractC4649jL0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Collection<? extends AbstractC4649jL0> allSupertypes) {
            Intrinsics.checkNotNullParameter(allSupertypes, "allSupertypes");
            this.a = allSupertypes;
            this.b = VE.c(R70.d);
        }
    }

    public B1(@NotNull OQ1 storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.b = storageManager.c(new C7522x1(this, 0), new C7732y1(this));
    }

    @NotNull
    public abstract Collection<AbstractC4649jL0> h();

    @Nullable
    public AbstractC4649jL0 i() {
        return null;
    }

    @NotNull
    public Collection<AbstractC4649jL0> j(boolean z) {
        return C5653o60.d;
    }

    @NotNull
    public abstract InterfaceC3792fV1 k();

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final List<AbstractC4649jL0> a() {
        return this.b.invoke().b;
    }

    @NotNull
    public List<AbstractC4649jL0> m(@NotNull List<AbstractC4649jL0> supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    public void n(@NotNull AbstractC4649jL0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
