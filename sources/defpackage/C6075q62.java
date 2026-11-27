package defpackage;

import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: q62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6075q62 {
    public final boolean a;
    public final boolean b;

    @NotNull
    public final InterfaceC4366iD c;

    @NotNull
    public final AbstractC5912pL0 d;

    @NotNull
    public final AbstractC6331rL0 e;
    public int f;

    @Nullable
    public ArrayDeque<InterfaceC6126qM1> g;

    @Nullable
    public C3768fN1 h;

    /* JADX INFO: renamed from: q62$a */
    public interface a {

        /* JADX INFO: renamed from: q62$a$a, reason: collision with other inner class name */
        public static final class C0473a implements a {
            public boolean a;

            @Override // defpackage.C6075q62.a
            public final void a(@NotNull C7101v1 block) {
                Intrinsics.checkNotNullParameter(block, "block");
                if (this.a) {
                    return;
                }
                this.a = ((Boolean) block.invoke()).booleanValue();
            }
        }

        void a(@NotNull C7101v1 c7101v1);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: q62$b */
    public static final class b {
        public static final /* synthetic */ b[] d;

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        static {
            b[] bVarArr = {new b("CHECK_ONLY_LOWER", 0), new b("CHECK_SUBTYPE_AND_LOWER", 1), new b("SKIP_LOWER", 2)};
            d = bVarArr;
            C1952Ru.i(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    /* JADX INFO: renamed from: q62$c */
    public static abstract class c {

        /* JADX INFO: renamed from: q62$c$a */
        public static abstract class a extends c {
        }

        /* JADX INFO: renamed from: q62$c$b */
        public static final class b extends c {

            @NotNull
            public static final b a = new b();

            @Override // defpackage.C6075q62.c
            @NotNull
            public final InterfaceC6126qM1 a(@NotNull C6075q62 state, @NotNull InterfaceC5702oL0 type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.c.r(type);
            }
        }

        /* JADX INFO: renamed from: q62$c$c, reason: collision with other inner class name */
        public static final class C0474c extends c {

            @NotNull
            public static final C0474c a = new C0474c();

            @Override // defpackage.C6075q62.c
            public final InterfaceC6126qM1 a(C6075q62 state, InterfaceC5702oL0 type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: renamed from: q62$c$d */
        public static final class d extends c {

            @NotNull
            public static final d a = new d();

            @Override // defpackage.C6075q62.c
            @NotNull
            public final InterfaceC6126qM1 a(@NotNull C6075q62 state, @NotNull InterfaceC5702oL0 type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.c.I(type);
            }
        }

        @NotNull
        public abstract InterfaceC6126qM1 a(@NotNull C6075q62 c6075q62, @NotNull InterfaceC5702oL0 interfaceC5702oL0);
    }

    public C6075q62(boolean z, boolean z2, @NotNull InterfaceC4366iD typeSystemContext, @NotNull AbstractC5912pL0 kotlinTypePreparator, @NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.a = z;
        this.b = z2;
        this.c = typeSystemContext;
        this.d = kotlinTypePreparator;
        this.e = kotlinTypeRefiner;
    }

    public final void a() {
        ArrayDeque<InterfaceC6126qM1> arrayDeque = this.g;
        Intrinsics.checkNotNull(arrayDeque);
        arrayDeque.clear();
        C3768fN1 c3768fN1 = this.h;
        Intrinsics.checkNotNull(c3768fN1);
        c3768fN1.clear();
    }

    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque<>(4);
        }
        if (this.h == null) {
            this.h = new C3768fN1();
        }
    }

    @NotNull
    public final InterfaceC5702oL0 c(@NotNull InterfaceC5702oL0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.d.w(type);
    }
}
