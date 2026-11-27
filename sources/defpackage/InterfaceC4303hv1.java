package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4303hv1 {

    /* JADX INFO: renamed from: hv1$a */
    public static final class a extends d {

        @NotNull
        public final C2231Vj b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C2231Vj selectedAsset) {
            super(selectedAsset);
            Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
            this.b = selectedAsset;
        }

        @Override // defpackage.InterfaceC4303hv1.d
        @NotNull
        public final C2231Vj a() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: hv1$b */
    public static final class b implements InterfaceC4303hv1 {

        @NotNull
        public static final b a = new b();
    }

    /* JADX INFO: renamed from: hv1$c */
    public static final class c extends d {

        @NotNull
        public final C2231Vj b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull C2231Vj selectedAsset) {
            super(selectedAsset);
            Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
            this.b = selectedAsset;
        }

        @Override // defpackage.InterfaceC4303hv1.d
        @NotNull
        public final C2231Vj a() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: hv1$d */
    public static abstract class d implements InterfaceC4303hv1 {

        @NotNull
        public final C2231Vj a;

        public d(C2231Vj c2231Vj) {
            this.a = c2231Vj;
        }

        @NotNull
        public C2231Vj a() {
            return this.a;
        }
    }
}
