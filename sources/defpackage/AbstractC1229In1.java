package defpackage;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: In1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1229In1 {

    @NotNull
    public final ByteBuffer a;

    @NotNull
    public final C6660su1 b;

    /* JADX INFO: renamed from: In1$a */
    public static final class a extends AbstractC1229In1 {

        @NotNull
        public static final a c = new a(C1307Jn1.a, C1307Jn1.b);

        @NotNull
        public final String toString() {
            return "IDLE(empty)";
        }
    }

    /* JADX INFO: renamed from: In1$b */
    public static final class b extends AbstractC1229In1 {

        @NotNull
        public final c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull c initial) {
            super(initial.a, initial.b);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.c = initial;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 c() {
            return this.c.f;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 d() {
            return this.c.g;
        }

        @NotNull
        public final String toString() {
            return "IDLE(with buffer)";
        }
    }

    /* JADX INFO: renamed from: In1$c */
    public static final class c extends AbstractC1229In1 {

        @NotNull
        public final ByteBuffer c;

        @NotNull
        public final ByteBuffer d;

        @NotNull
        public final b e;

        @NotNull
        public final d f;

        @NotNull
        public final g g;

        @NotNull
        public final e h;

        public /* synthetic */ c(ByteBuffer byteBuffer) {
            this(byteBuffer, 8);
        }

        @Override // defpackage.AbstractC1229In1
        @NotNull
        public final ByteBuffer a() {
            return this.d;
        }

        @Override // defpackage.AbstractC1229In1
        @NotNull
        public final ByteBuffer b() {
            return this.c;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 c() {
            return this.f;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 d() {
            return this.g;
        }

        @NotNull
        public final String toString() {
            return "Initial";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull ByteBuffer backingBuffer, int i) {
            super(backingBuffer, new C6660su1(backingBuffer.capacity() - i));
            Intrinsics.checkNotNullParameter(backingBuffer, "backingBuffer");
            if (backingBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (backingBuffer.limit() != backingBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ByteBuffer byteBufferDuplicate = backingBuffer.duplicate();
            Intrinsics.checkNotNullExpressionValue(byteBufferDuplicate, "backingBuffer.duplicate()");
            this.c = byteBufferDuplicate;
            ByteBuffer byteBufferDuplicate2 = backingBuffer.duplicate();
            Intrinsics.checkNotNullExpressionValue(byteBufferDuplicate2, "backingBuffer.duplicate()");
            this.d = byteBufferDuplicate2;
            this.e = new b(this);
            this.f = new d(this);
            this.g = new g(this);
            this.h = new e(this);
        }
    }

    /* JADX INFO: renamed from: In1$d */
    public static final class d extends AbstractC1229In1 {

        @NotNull
        public final c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull c initial) {
            super(initial.a, initial.b);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.c = initial;
        }

        @Override // defpackage.AbstractC1229In1
        @NotNull
        public final ByteBuffer a() {
            return this.c.d;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 d() {
            return this.c.h;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 e() {
            return this.c.e;
        }

        @NotNull
        public final String toString() {
            return "Reading";
        }
    }

    /* JADX INFO: renamed from: In1$e */
    public static final class e extends AbstractC1229In1 {

        @NotNull
        public final c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull c initial) {
            super(initial.a, initial.b);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.c = initial;
        }

        @Override // defpackage.AbstractC1229In1
        @NotNull
        public final ByteBuffer a() {
            return this.c.d;
        }

        @Override // defpackage.AbstractC1229In1
        @NotNull
        public final ByteBuffer b() {
            return this.c.c;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 e() {
            return this.c.g;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 f() {
            return this.c.f;
        }

        @NotNull
        public final String toString() {
            return "Reading+Writing";
        }
    }

    /* JADX INFO: renamed from: In1$f */
    public static final class f extends AbstractC1229In1 {

        @NotNull
        public static final f c = new f(C1307Jn1.a, C1307Jn1.b);

        @NotNull
        public final String toString() {
            return "Terminated";
        }
    }

    /* JADX INFO: renamed from: In1$g */
    public static final class g extends AbstractC1229In1 {

        @NotNull
        public final c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull c initial) {
            super(initial.a, initial.b);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.c = initial;
        }

        @Override // defpackage.AbstractC1229In1
        @NotNull
        public final ByteBuffer b() {
            return this.c.c;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 c() {
            return this.c.h;
        }

        @Override // defpackage.AbstractC1229In1
        public final AbstractC1229In1 f() {
            return this.c.e;
        }

        @NotNull
        public final String toString() {
            return "Writing";
        }
    }

    public AbstractC1229In1(ByteBuffer byteBuffer, C6660su1 c6660su1) {
        this.a = byteBuffer;
        this.b = c6660su1;
    }

    @NotNull
    public ByteBuffer a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    @NotNull
    public ByteBuffer b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    @NotNull
    public AbstractC1229In1 c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    @NotNull
    public AbstractC1229In1 d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    @NotNull
    public AbstractC1229In1 e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    @NotNull
    public AbstractC1229In1 f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
