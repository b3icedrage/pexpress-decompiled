package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6331rL0 extends G1 {

    /* JADX INFO: renamed from: rL0$a */
    public static final class a extends AbstractC6331rL0 {

        @NotNull
        public static final a e = new a();

        @Override // defpackage.AbstractC6331rL0
        @NotNull
        /* JADX INFO: renamed from: A */
        public final AbstractC4649jL0 t(@NotNull InterfaceC5702oL0 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return (AbstractC4649jL0) type;
        }

        @Override // defpackage.AbstractC6331rL0
        @Nullable
        public final void w(@NotNull QC classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
        }

        @Override // defpackage.AbstractC6331rL0
        public final void x(@NotNull S01 moduleDescriptor) {
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        }

        @Override // defpackage.AbstractC6331rL0
        public final void y(InterfaceC4675jU descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        }

        @Override // defpackage.AbstractC6331rL0
        @NotNull
        public final Collection<AbstractC4649jL0> z(@NotNull FC classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Collection<AbstractC4649jL0> collectionA = classDescriptor.p().a();
            Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
            return collectionA;
        }
    }

    @Override // defpackage.G1
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC4649jL0 t(@NotNull InterfaceC5702oL0 interfaceC5702oL0);

    @Nullable
    public abstract void w(@NotNull QC qc);

    public abstract void x(@NotNull S01 s01);

    @Nullable
    public abstract void y(@NotNull InterfaceC4675jU interfaceC4675jU);

    @NotNull
    public abstract Collection<AbstractC4649jL0> z(@NotNull FC fc);
}
