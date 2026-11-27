package kotlin.text;

import defpackage.C6367rX0;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchResult;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MatchResult {
    @NotNull
    List<String> a();

    @NotNull
    C6367rX0.b b();

    @NotNull
    IntRange c();

    @NotNull
    String getValue();

    @Nullable
    C6367rX0 next();
}
