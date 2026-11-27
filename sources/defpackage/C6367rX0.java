package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6367rX0 implements MatchResult {

    @NotNull
    public final Matcher a;

    @NotNull
    public final CharSequence b;

    @NotNull
    public final b c;

    @Nullable
    public a d;

    /* JADX INFO: renamed from: rX0$a */
    public static final class a extends AbstractC5838p0<String> {
        public a() {
        }

        @Override // defpackage.Y
        public final int b() {
            return C6367rX0.this.a.groupCount() + 1;
        }

        @Override // defpackage.Y, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i) {
            String strGroup = C6367rX0.this.a.group(i);
            return strGroup == null ? "" : strGroup;
        }

        @Override // defpackage.AbstractC5838p0, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // defpackage.AbstractC5838p0, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: rX0$b */
    public static final class b extends Y<MatchGroup> {
        public b() {
        }

        @Override // defpackage.Y
        public final int b() {
            return C6367rX0.this.a.groupCount() + 1;
        }

        public final MatchGroup c(int i) {
            C6367rX0 c6367rX0 = C6367rX0.this;
            Matcher matcher = c6367rX0.a;
            IntRange intRangeI = f.i(matcher.start(i), matcher.end(i));
            if (intRangeI.d < 0) {
                return null;
            }
            String strGroup = c6367rX0.a.group(i);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return new MatchGroup(strGroup, intRangeI);
        }

        @Override // defpackage.Y, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return super.contains((MatchGroup) obj);
            }
            return false;
        }

        @Override // defpackage.Y, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<MatchGroup> iterator() {
            return new C42.a(JH1.m(CollectionsKt.y(WE.d(this)), new C5984ph(this, 2)));
        }
    }

    public C6367rX0(@NotNull Matcher matcher, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.a = matcher;
        this.b = input;
        this.c = new b();
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final List<String> a() {
        if (this.d == null) {
            this.d = new a();
        }
        a aVar = this.d;
        Intrinsics.checkNotNull(aVar);
        return aVar;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final b b() {
        return this.c;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final IntRange c() {
        Matcher matcher = this.a;
        return f.i(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final String getValue() {
        String strGroup = this.a.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    @Nullable
    public final C6367rX0 next() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new C6367rX0(matcher2, charSequence);
        }
        return null;
    }
}
