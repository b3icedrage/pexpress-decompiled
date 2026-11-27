package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5240m8 {

    /* JADX INFO: renamed from: m8$a */
    public static final class a implements InterfaceC5240m8 {

        @NotNull
        public static final a a = new a();

        @Override // defpackage.InterfaceC5240m8
        @NotNull
        public final Collection<AbstractC4649jL0> b(@NotNull FC classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return C5653o60.d;
        }

        @Override // defpackage.InterfaceC5240m8
        @NotNull
        public final Collection<InterfaceC3765fM1> c(@NotNull C5638o21 name, @NotNull FC classDescriptor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return C5653o60.d;
        }

        @Override // defpackage.InterfaceC5240m8
        @NotNull
        public final Collection<C5638o21> d(@NotNull FC classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return C5653o60.d;
        }

        @Override // defpackage.InterfaceC5240m8
        @NotNull
        public final Collection<InterfaceC7984zC> e(@NotNull FC classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return C5653o60.d;
        }
    }

    @NotNull
    Collection<AbstractC4649jL0> b(@NotNull FC fc);

    @NotNull
    Collection<InterfaceC3765fM1> c(@NotNull C5638o21 c5638o21, @NotNull FC fc);

    @NotNull
    Collection<C5638o21> d(@NotNull FC fc);

    @NotNull
    Collection<InterfaceC7984zC> e(@NotNull FC fc);
}
