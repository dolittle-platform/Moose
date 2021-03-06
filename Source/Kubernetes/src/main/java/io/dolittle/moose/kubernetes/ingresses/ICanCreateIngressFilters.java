// Copyright (c) Dolittle. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package io.dolittle.moose.kubernetes.ingresses;

import java.util.function.Predicate;

import io.dolittle.moose.kubernetes.Annotation;
import io.dolittle.moose.kubernetes.Namespace;

/**
 * Defines a system that can create {@link Predicate} filters for {@link Ingress}.
 */
public interface ICanCreateIngressFilters {
    /**
     * Creates a filter that matches only ingresses in the given namespace.
     * @param namespace The {@link Namespace} to match against.
     * @return A {@link Predicate} of type {@link Ingress}
     */
    Predicate<Ingress> namespaceFilter(Namespace namespace);

    /**
     * Creates a filter that matches only ingresses that contain all of the given annotations.
     * @param annotations The list of {@link Annotation} to match against.
     * @return A {@link Predicate} of type {@link Ingress}
     */
    Predicate<Ingress> annotationsFilter(Annotation... annotations);
}

