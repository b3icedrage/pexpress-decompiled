package kotlin.text;

import defpackage.C6367rX0;
import defpackage.EnumC4537iq1;
import defpackage.InterfaceC1983Se0;
import defpackage.R51;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "input", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "e", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final Pattern d;

    /* JADX INFO: renamed from: kotlin.text.Regex$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Regex(@NotNull Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.d = nativePattern;
    }

    public static C6367rX0 b(Regex regex, CharSequence input) {
        regex.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = regex.d.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new C6367rX0(matcher, input);
        }
        return null;
    }

    public final boolean a(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.d.matcher(input).find();
    }

    @Nullable
    public final C6367rX0 c(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.d.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new C6367rX0(matcher, input);
        }
        return null;
    }

    public final boolean d(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.d.matcher(input).matches();
    }

    @NotNull
    public final String e(@NotNull String input, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        C6367rX0 c6367rX0B = b(this, input);
        if (c6367rX0B == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append((CharSequence) input, i, c6367rX0B.c().d);
            sb.append((CharSequence) transform.invoke(c6367rX0B));
            i = c6367rX0B.c().e + 1;
            c6367rX0B = c6367rX0B.next();
            if (i >= length) {
                break;
            }
        } while (c6367rX0B != null);
        if (i < length) {
            sb.append((CharSequence) input, i, length);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceAll = this.d.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @NotNull
    public final String toString() {
        String string = this.d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull EnumC4537iq1 option) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        Companion companion = INSTANCE;
        int i = option.d;
        companion.getClass();
        Pattern patternCompile = Pattern.compile(pattern, (i & 2) != 0 ? i | 64 : i);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull Set options) {
        Intrinsics.checkNotNullParameter("<title[^>]*>(.*?)</title>", "pattern");
        Intrinsics.checkNotNullParameter(options, "options");
        Companion companion = INSTANCE;
        Iterator it = options.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((InterfaceC1983Se0) it.next()).getValue();
        }
        companion.getClass();
        Pattern patternCompile = Pattern.compile("<title[^>]*>(.*?)</title>", (value & 2) != 0 ? value | 64 : value);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
