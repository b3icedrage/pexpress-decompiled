package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7081uv extends AbstractC5393ms {

    @NotNull
    public static final C7081uv f = new C7081uv(1, 0, 7);

    /* JADX INFO: renamed from: uv$a */
    public static final class a {
        @NotNull
        public static C7081uv a(@NotNull InputStream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(XE.m(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (((DB0) it).g) {
                ((CB0) it).b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            int[] iArr = new int[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                iArr[i] = ((Number) it2.next()).intValue();
                i++;
            }
            return new C7081uv(Arrays.copyOf(iArr, iArr.length));
        }
    }

    static {
        new C7081uv(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7081uv(@NotNull int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }
}
