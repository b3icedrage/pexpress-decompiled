package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5317mX implements Sequence<IntRange> {

    @NotNull
    public final CharSequence a;
    public final int b;

    @NotNull
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> c;

    /* JADX INFO: renamed from: mX$a */
    public static final class a implements Iterator<IntRange>, InterfaceC6745tJ0 {
        public int d = -1;
        public int e;
        public int g;
        public IntRange h;
        public int i;

        public a() {
            C5317mX.this.getClass();
            int iC = f.c(0, C5317mX.this.a.length());
            this.e = iC;
            this.g = iC;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        public final void b() {
            Pair<Integer, Integer> pairInvoke;
            int i = this.g;
            if (i < 0) {
                this.d = 0;
                this.h = null;
                return;
            }
            C5317mX c5317mX = C5317mX.this;
            int i2 = c5317mX.b;
            if (i2 > 0) {
                int i3 = this.i + 1;
                this.i = i3;
                if (i3 >= i2) {
                    this.h = new IntRange(this.e, StringsKt.E(c5317mX.a), 1);
                    this.g = -1;
                } else if (i > c5317mX.a.length() && (pairInvoke = c5317mX.c.invoke(c5317mX.a, Integer.valueOf(this.g))) != null) {
                    int iIntValue = pairInvoke.d.intValue();
                    int iIntValue2 = pairInvoke.e.intValue();
                    this.h = f.i(this.e, iIntValue);
                    int i4 = iIntValue + iIntValue2;
                    this.e = i4;
                    this.g = i4 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.h = new IntRange(this.e, StringsKt.E(c5317mX.a), 1);
                    this.g = -1;
                }
            } else if (i > c5317mX.a.length()) {
                this.h = new IntRange(this.e, StringsKt.E(c5317mX.a), 1);
                this.g = -1;
            } else {
                int iIntValue3 = pairInvoke.d.intValue();
                int iIntValue4 = pairInvoke.e.intValue();
                this.h = f.i(this.e, iIntValue3);
                int i5 = iIntValue3 + iIntValue4;
                this.e = i5;
                this.g = i5 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.d = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.d == -1) {
                b();
            }
            return this.d == 1;
        }

        @Override // java.util.Iterator
        public final IntRange next() {
            if (this.d == -1) {
                b();
            }
            if (this.d == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.h;
            Intrinsics.c(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.h = null;
            this.d = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5317mX(@NotNull CharSequence input, int i, @NotNull Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.a = input;
        this.b = i;
        this.c = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<IntRange> iterator() {
        return new a();
    }
}
